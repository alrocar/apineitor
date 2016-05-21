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

import java.io.InputStream;

public class APIException extends Exception {
	// UID for serialization
	private static final long serialVersionUID = 6424174253911720338L;

	// private fields
	private int responseCode;

	// private fields
	private InputStream rawBody;

	/**
	 * The HTTP response code from the API request
	 */
	public int getResponseCode() {
		return responseCode;
	}

	/**
	 * The HTTP response body from the API request
	 */
	public InputStream getRawBody() {
		return rawBody;
	}

	/**
	 * Initialization constructor
	 * 
	 * @param reason
	 *            The reason for throwing exception
	 * @param code
	 *            The HTTP response code from the API request
	 */
	public APIException(String reason, int code, InputStream body) {
		super(reason);
		this.responseCode = code;
		this.rawBody = body;
	}

	/**
	 * Initialization constructor
	 * 
	 * @param reason
	 *            The reason for throwing exception
	 */
	public APIException(String reason) {
		super(reason);
	}
}