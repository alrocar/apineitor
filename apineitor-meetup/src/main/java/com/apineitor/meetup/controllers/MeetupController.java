/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 Alberto Romeu
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
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
