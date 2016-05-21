/**
 * @aromeu
 */
package com.apineitor.http;

import com.apineitor.request.HttpRequest;
import com.apineitor.response.HttpResponse;

public class HttpContext {
	private HttpRequest _request;
	private HttpResponse _response;

	public HttpContext(HttpRequest request, HttpResponse response) {
		_request = request;
		_response = response;
	}

	/**
	 * GETTER for the Http Request
	 * 
	 * @return HttpRequest request
	 */
	public HttpRequest getRequest() {
		return _request;
	}

	/**
	 * GETTER for the Http Response
	 * 
	 * @return HttpResponse response
	 */
	public HttpResponse getRespone() {
		return _response;
	}
}