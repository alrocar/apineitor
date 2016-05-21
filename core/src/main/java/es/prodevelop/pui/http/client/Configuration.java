/**
 * @aromeu
 */
package es.prodevelop.pui.http.client;

public class Configuration {
	// The base Uri for API calls
	private String baseUri = "https://www.eventbriteapi.com";

	// The OAuth 2.0 access token to be set before API calls
	// TODO: Replace the oAuthAccessToken with an appropriate value
	private String oAuthAccessToken = "TODO: Replace";

	public Configuration(String baseUri, String oAuthAccessToken) {
		this.baseUri = baseUri;
		this.oAuthAccessToken = oAuthAccessToken;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public String getoAuthAccessToken() {
		return oAuthAccessToken;
	}
}
