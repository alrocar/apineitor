package es.prodevelop.pui.http.client.controllers;

import es.prodevelop.pui.http.client.APIException;
import es.prodevelop.pui.http.client.APIHelper;
import es.prodevelop.pui.http.client.Configuration;
import es.prodevelop.pui.http.client.HttpClient;
import es.prodevelop.pui.http.client.models.APIEndPoint;
import es.prodevelop.pui.http.client.models.APIResponse;

public class JacksonAPIController<T extends APIEndPoint, R extends APIResponse>
		extends APIController<T, R> {

	public JacksonAPIController(Configuration _configuration,
			Class<R> _responseType) {
		super(_configuration, _responseType);
	}

	public JacksonAPIController(HttpClient _client,
			Configuration _configuration, Class<R> _responseType) {
		super(_client, _configuration, _responseType);
	}

	@SuppressWarnings("unchecked")
	public R deserialize(String json, Class<?> responseType)
			throws APIException {
		return (R) APIHelper.deserialize(json, responseType);
	}
}
