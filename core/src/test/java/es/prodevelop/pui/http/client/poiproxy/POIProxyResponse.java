package es.prodevelop.pui.http.client.poiproxy;

import es.prodevelop.pui.http.client.models.APIResponse;

public class POIProxyResponse implements APIResponse {
	private String type;

	public POIProxyResponse() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
