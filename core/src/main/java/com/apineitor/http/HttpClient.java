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
package com.apineitor.http;

import java.util.Map;

import com.apineitor.request.HttpBodyRequest;
import com.apineitor.request.HttpRequest;
import com.apineitor.response.HttpResponse;

public interface HttpClient {

	/**
	 * Execute a given HttpRequest to get string response back
	 * 
	 * @param request
	 *            The given HttpRequest to execute
	 * @param callBack
	 *            Callback after execution
	 * @throws APIException
	 */
	public void executeAsStringAsync(final HttpRequest request,
			final APICallBack<HttpResponse> callBack) throws APIException;

	/**
	 * Execute a given HttpRequest to get binary response back
	 * 
	 * @param request
	 *            The given HttpRequest to execute
	 * @param callBack
	 *            Callback after execution
	 * @throws APIException
	 */
	public void executeAsBinaryAsync(final HttpRequest request,
			final APICallBack<HttpResponse> callBack) throws APIException;

	/**
	 * Execute a given HttpRequest to get binary response back
	 * 
	 * @param request
	 *            The given HttpRequest to execute
	 */
	public HttpResponse executeAsBinary(final HttpRequest request)
			throws APIException;

	/**
	 * Execute a given HttpRequest to get string response back
	 * 
	 * @param request
	 *            The given HttpRequest to execute
	 */
	public HttpResponse executeAsString(final HttpRequest request)
			throws APIException;

	/**
	 * Create a simple HTTP GET request with basic authentication
	 */
	public HttpRequest get(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters, String _username, String _password);

	/**
	 * Create a simple HTTP GET request
	 */
	public HttpRequest get(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters);

	/**
	 * Create an HTTP POST request with parameters
	 */
	public HttpRequest post(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters);

	/**
	 * Create an HTTP POST request with parameters and with basic authentication
	 */
	public HttpRequest post(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters, String _username, String _password);

	/**
	 * Create an HTTP POST request with body
	 */
	public HttpBodyRequest postBody(String _queryUrl,
			Map<String, String> _headers, String _body);

	/**
	 * Create an HTTP POST request with body and with basic authentication
	 */
	public HttpBodyRequest postBody(String _queryUrl,
			Map<String, String> _headers, String _body, String _username,
			String _password);

	/**
	 * Create an HTTP PUT request with parameters
	 */
	public HttpRequest put(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters);

	/**
	 * Create an HTTP PUT request with parameters and with basic authentication
	 */
	HttpRequest put(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters, String _username, String _password);

	/**
	 * Create an HTTP PUT request with body
	 */
	HttpBodyRequest putBody(String _queryUrl, Map<String, String> _headers,
			String _body);

	/**
	 * Create an HTTP PUT request with body and with basic authentication
	 */
	public HttpBodyRequest putBody(String _queryUrl,
			Map<String, String> _headers, String _body, String _username,
			String _password);

	/**
	 * Create an HTTP PATCH request with parameters
	 */
	public HttpRequest patch(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters);

	/**
	 * Create an HTTP PATCH request with parameters and with basic
	 * authentication
	 */
	HttpRequest patch(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters, String _username, String _password);

	/**
	 * Create an HTTP PATCH request with body
	 */
	public HttpBodyRequest patchBody(String _queryUrl,
			Map<String, String> _headers, String _body);

	/**
	 * Create an HTTP PATCH request with body and with basic authentication
	 */
	public HttpBodyRequest patchBody(String _queryUrl,
			Map<String, String> _headers, String _body, String _username,
			String _password);

	/**
	 * Create an HTTP DELETE request with parameters
	 */
	HttpRequest delete(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters);

	/**
	 * Create an HTTP DELETE request with parameters and with basic
	 * authentication
	 */
	public HttpRequest delete(String _queryUrl, Map<String, String> _headers,
			Map<String, Object> _parameters, String _username, String _password);

	/**
	 * Create an HTTP DELETE request with body
	 */
	public HttpBodyRequest deleteBody(String _queryUrl,
			Map<String, String> _headers, String _body);

	/**
	 * Create an HTTP DELETE request with body and with basic authentication
	 */
	public HttpBodyRequest deleteBody(String _queryUrl,
			Map<String, String> _headers, String _body, String _username,
			String _password);
}