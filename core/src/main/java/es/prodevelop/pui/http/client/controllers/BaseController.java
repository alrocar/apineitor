/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.controllers;

import es.prodevelop.pui.http.client.Configuration;
import es.prodevelop.pui.http.client.HttpClient;
import es.prodevelop.pui.http.client.UnirestClient;

public abstract class BaseController {
	/**
	 * Protected variable to keep reference of client instance
	 */
	protected HttpClient clientInstance = null;

	/**
	 * Protected variable to keep reference of API configuration (base end
	 * point, access token, etc.)
	 */
	protected Configuration configuration = null;

	/**
	 * Initialize with the default http client
	 * 
	 * @param _configuration
	 *            The API configuration
	 */
	public BaseController(Configuration configuration) {
		clientInstance = UnirestClient.getSharedInstance();
		this.configuration = configuration;
	}

	/**
	 * Initialize the base controller using the given http client
	 *
	 * @param _client
	 *            The given http client
	 * @param _configuration
	 *            The API configuration
	 */
	public BaseController(HttpClient _client, Configuration _configuration) {
		clientInstance = _client;
		this.configuration = _configuration;
	}
}