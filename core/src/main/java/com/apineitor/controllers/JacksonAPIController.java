package com.apineitor.controllers;

import com.apineitor.http.APIException;
import com.apineitor.http.APIHelper;
import com.apineitor.http.Configuration;
import com.apineitor.http.HttpClient;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIResponse;

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
