/**
 * @aromeu
 */
package com.apineitor.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.apineitor.http.APICallBack;
import com.apineitor.http.APIException;
import com.apineitor.http.APIHelper;
import com.apineitor.http.Configuration;
import com.apineitor.http.HttpClient;
import com.apineitor.http.HttpContext;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIResponse;
import com.apineitor.request.HttpMethod;
import com.apineitor.request.HttpRequest;
import com.apineitor.request.PostParamHashMap;
import com.apineitor.request.QueryParamHashMap;
import com.apineitor.request.TemplateParamHashMap;
import com.apineitor.response.HttpResponse;
import com.apineitor.response.HttpStringResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class APIController<T extends APIEndPoint, R extends APIResponse>
		extends BaseController {

	protected Class<R> responseType;
	private Gson gson = new GsonBuilder().create();

	/**
	 * Initialize the base controller using the given http client
	 * 
	 * @param _configuration
	 *            The API configuration
	 * @param _responseType
	 *            The response Class
	 */
	public APIController(Configuration _configuration, Class<R> _responseType) {
		super(_configuration);
		this.responseType = _responseType;
	}

	/**
	 * Initialize the base controller using the given http client
	 *
	 * @param _client
	 *            The given http client
	 * @param _configuration
	 *            The API configuration
	 * @param _responseType
	 *            The response Class
	 */
	public APIController(HttpClient _client, Configuration _configuration,
			Class<R> _responseType) {
		super(_client, _configuration);
		this.responseType = _responseType;
	}

	public R get(final T apiEndPoint) throws APIException {
		return this.get(apiEndPoint, responseType);
	}

	public R post(final T apiEndPoint) throws APIException {
		return this.post(apiEndPoint, responseType);
	}

	public void getAsync(final T apiEndPoint, final APICallBack<R> callBack)
			throws APIException {
		this.getAsync(apiEndPoint, responseType, callBack);
	}

	public R get(final T apiEndPoint, Class<?> responseType)
			throws APIException {
		final APIEndPointAnnotation endPointAnnotation = apiEndPoint.getClass()
				.getAnnotation(APIEndPointAnnotation.class);

		String queryUrl = prepareQuery(apiEndPoint, endPointAnnotation);

		Map<String, String> headers = prepareHeader(endPointAnnotation);

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.get(queryUrl, headers, null);

		R result = execute(responseType, request);

		return result;
	}

	public R post(final T apiEndPoint, Class<?> responseType)
			throws APIException {
		final APIEndPointAnnotation endPointAnnotation = apiEndPoint.getClass()
				.getAnnotation(APIEndPointAnnotation.class);

		String queryUrl = prepareQuery(apiEndPoint, endPointAnnotation);

		Map<String, String> headers = prepareHeader(endPointAnnotation);

		Map<String, Object> parameters = prepareParameters(apiEndPoint,
				endPointAnnotation);

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.post(queryUrl, headers,
				parameters);

		R result = execute(responseType, request);

		return result;
	}

	public R postBody(final T apiEndPoint, Class<?> responseType)
			throws APIException {
		final APIEndPointAnnotation endPointAnnotation = apiEndPoint.getClass()
				.getAnnotation(APIEndPointAnnotation.class);

		String queryUrl = prepareQuery(apiEndPoint, endPointAnnotation);

		Map<String, String> headers = prepareHeader(endPointAnnotation);

		String body = null;
		try {
			body = (String) apiEndPoint.getClass()
					.getMethod("getBody", new Class[] {})
					.invoke(apiEndPoint, new Object[] {});
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			throw new APIException(e.getMessage());
		}

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.postBody(queryUrl, headers,
				body);

		R result = execute(responseType, request);

		return result;
	}

	private Map<String, Object> prepareParameters(APIEndPoint apiEndPoint,
			APIEndPointAnnotation endPointAnnotation) throws APIException {
		PostParamHashMap params = new PostParamHashMap(apiEndPoint);
		return (Map<String, Object>) params;
	}

	public void getAsync(final T apiEndPoint, final Class<?> responseType,
			final APICallBack<R> callBack) throws APIException {
		final APIEndPointAnnotation endPointAnnotation = apiEndPoint.getClass()
				.getAnnotation(APIEndPointAnnotation.class);

		String queryUrl = prepareQuery(apiEndPoint, endPointAnnotation);

		Map<String, String> headers = prepareHeader(endPointAnnotation);

		// prepare and invoke the API call request to fetch the response
		final HttpRequest request = clientInstance.get(queryUrl, headers, null);

		// invoke request and get response
		clientInstance.executeAsStringAsync(request,
				new APICallBack<HttpResponse>() {
					@Override
					public void onFailure(HttpContext context, Throwable error) {
						// Error handling using HTTP status codes
						// int responseCode = response.getStatusCode();
						// if ((responseCode < 200) || (responseCode > 206)) //
						// [200,206] = HTTP OK
						// throw new APIException("HTTP Response Not OK",
						// responseCode,
						// response.getRawBody());
						callBack.onFailure(context, error);
					}

					@Override
					public void onSuccess(HttpContext context,
							HttpResponse response) throws APIException {
						// extract result from the http response

						R result = deserialize(
								((HttpStringResponse) response).getBody(),
								responseType);
						callBack.onSuccess(context, result);
					}
				});
	}

	@SuppressWarnings("unchecked")
	public R deserialize(String json, Class<?> responseType)
			throws APIException {
		R result = (R) gson.fromJson(json, responseType);
		return result;
	}

	public Map<String, String> prepareHeader(
			final APIEndPointAnnotation endPointAnnotation) {
		// load all headers for the outgoing API request
		Map<String, String> headers = new HashMap<String, String>() {
			private static final long serialVersionUID = 5741976173555247004L;
			{
				put("user-agent", endPointAnnotation.userAgent());
				put("accept", endPointAnnotation.accept());
				put("Content-Type", endPointAnnotation.contentType());
			}
		};
		return headers;
	}

	@Deprecated
	public String prepareGet(final T apiEndPoint,
			final APIEndPointAnnotation endPointAnnotation) throws APIException {
		return this.prepareQuery(apiEndPoint, endPointAnnotation);
	}

	public String prepareQuery(final T apiEndPoint,
			final APIEndPointAnnotation endPointAnnotation) throws APIException {
		// the base uri for api requests
		String baseUri = this.configuration.getBaseUri();

		// prepare query string for API call
		StringBuilder queryBuilder = new StringBuilder(baseUri);

		queryBuilder.append(endPointAnnotation.url());

		// process template parameters
		APIHelper.appendUrlWithTemplateParameters(queryBuilder,
				new TemplateParamHashMap(apiEndPoint));

		// process query parameters
		APIHelper.appendUrlWithQueryParameters(queryBuilder,
				new QueryParamHashMap(apiEndPoint));
		// validate and preprocess url
		String queryUrl = APIHelper.cleanUrl(queryBuilder);

		if (endPointAnnotation.method().equals(HttpMethod.POST)) {
			queryUrl = org.apache.commons.lang.StringUtils.removeEnd(queryUrl,
					"?");
		}
		
		return queryUrl;
	}

	protected R execute(Class<?> responseType, final HttpRequest request)
			throws APIException {
		// invoke request and get response
		HttpResponse response = clientInstance.executeAsString(request);

		// Error handling using HTTP status codes
		int responseCode = response.getStatusCode();
		if ((responseCode < 200) || (responseCode > 206)) // [200,206] = HTTP OK
			throw new APIException("HTTP Response Not OK", responseCode,
					response.getRawBody());

		// extract result from the http response
		R result = deserialize(((HttpStringResponse) response).getBody(),
				responseType);
		return result;
	}
}