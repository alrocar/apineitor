package com.apineitor.tests.poiproxy;

import com.apineitor.models.APIResponse;

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
