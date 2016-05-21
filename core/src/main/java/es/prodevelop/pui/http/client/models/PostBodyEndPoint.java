/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.models;

public class PostBodyEndPoint implements APIEndPoint {

	@APIParamAnnotation(name = "body", isPostParam = true, isQueryParam = false, isTemplateParam = false)
	private String body;

	public PostBodyEndPoint(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
