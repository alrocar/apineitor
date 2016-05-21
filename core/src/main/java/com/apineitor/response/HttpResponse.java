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
package com.apineitor.response;

import java.io.InputStream;
import java.util.Map;
import org.apache.http.client.methods.HttpRequestBase;

public class HttpResponse {
	/**
	 * Private store for properties
	 */
	int statusCode;
	Map<String, String> headers;
	InputStream rawBody;
	HttpRequestBase baseRequest;

	/**
	 * HTTP Status code of the http response
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * Headers of the http response
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * Raw body of the http response
	 */
	public InputStream getRawBody() {
		return rawBody;
	}

	/**
	 * @param _code
	 *            The HTTP status code
	 * @param _headers
	 *            The HTTP headers read from response
	 * @param _rawBody
	 *            The raw data returned by the HTTP request
	 * @return Http response initialized with the given code, headers and
	 *         rawBody
	 */
	public HttpResponse(int _code, Map<String, String> _headers,
			InputStream _rawBody) {
		this.statusCode = _code;
		this.headers = _headers;
		this.rawBody = _rawBody;
	}

	/**
	 * @param _code
	 *            The HTTP status code
	 * @param _headers
	 *            The HTTP headers read from response
	 * @param _rawBody
	 *            The raw data returned by the HTTP request
	 * @param _baseReq
	 *            The underlying http base request from the apache http library
	 * @return Http response initialized with the given code, headers and
	 *         rawBody
	 */
	public HttpResponse(int _code, Map<String, String> _headers,
			InputStream _rawBody, HttpRequestBase _baseReq) {
		this(_code, _headers, _rawBody);
		this.baseRequest = _baseReq;
	}

	/**
	 * Shutdowns any pending http resources e.g., input streams and realses
	 * connection
	 */
	public void shutdown() {
		if (baseRequest != null) {
			baseRequest.releaseConnection();
		}
	}
}