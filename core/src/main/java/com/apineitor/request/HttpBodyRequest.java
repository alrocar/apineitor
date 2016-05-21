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
package com.apineitor.request;

import java.util.Map;

public class HttpBodyRequest extends HttpRequest {
	/**
	 * Private store for properties
	 */
	private String body;

	/**
	 * Body for the http request
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Create a request with explicit body
	 *
	 * @param _method
	 *            The HTTP method to use. Can be PUT, POST, DELETE and PATCH
	 * @param _queryUrl
	 *            The http url to create the HTTP Request. Expect a fully
	 *            qualified absolute Url
	 * @param _headers
	 *            The key-value map of all http headers to be sent
	 * @param _body
	 *            The object to be sent as body after serialization
	 * @return Http request initialized with the given method, url, headers and
	 *         request body
	 */
	public HttpBodyRequest(HttpMethod _method, String _queryUrl,
			Map<String, String> _headers, String _body) {
		super(_method, _queryUrl, _headers, null);
		this.body = _body != null ? _body : "";
	}

	/**
	 * Create a request with explicit body
	 *
	 * @param _method
	 *            The HTTP method to use. Can be PUT, POST, DELETE and PATCH
	 * @param _queryUrl
	 *            The http url to create the HTTP Request. Expect a fully
	 *            qualified absolute Url
	 * @param _headers
	 *            The key-value map of all http headers to be sent
	 * @param _body
	 *            The object to be sent as body after serialization
	 * @param _username
	 *            Username for basic authentication
	 * @param _password
	 *            Password for basic authentication
	 * @return Http request initialized with the given method, url, headers and
	 *         request body
	 */
	public HttpBodyRequest(HttpMethod _method, String _queryUrl,
			Map<String, String> _headers, String _body, String _username,
			String _password) {
		super(_method, _queryUrl, _headers, null, _username, _password);
		this.body = _body != null ? _body : "";
	}
}
