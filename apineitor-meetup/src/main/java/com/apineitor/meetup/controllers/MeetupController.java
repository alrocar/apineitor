package com.apineitor.meetup.controllers;

import java.util.HashMap;
import java.util.Map;

import com.apineitor.controllers.APIController;
import com.apineitor.http.APIException;
import com.apineitor.http.APIHelper;
import com.apineitor.http.Configuration;
import com.apineitor.http.HttpClient;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIResponse;

public class MeetupController extends APIController<APIEndPoint, APIResponse> {

	/**
	 * Initialize the base controller using the given http client
	 */
	public MeetupController(Configuration _configuration, Class<APIResponse> _responseType) {
		super(_configuration, _responseType);
	}

	/**
	 * Initialize the base controller using the given http client
	 *
	 * @param _client
	 *            The given http client
	 */
	public MeetupController(HttpClient _client, Configuration _configuration, Class<APIResponse> _responseType) {
		super(_client, _configuration, _responseType);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String prepareGet(final APIEndPoint apiEndPoint, final APIEndPointAnnotation endPointAnnotation)
			throws APIException {
		String queryUrl = super.prepareGet(apiEndPoint, endPointAnnotation);

		StringBuilder queryBuilder = new StringBuilder(queryUrl);

		Map<String, Object> keyParam = new HashMap<String, Object>();
		keyParam.put("key", this.configuration.getoAuthAccessToken());

		APIHelper.appendUrlWithQueryParameters(queryBuilder, keyParam);

		return queryBuilder.toString();
	}
}
