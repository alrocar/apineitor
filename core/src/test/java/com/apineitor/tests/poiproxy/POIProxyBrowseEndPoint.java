package com.apineitor.tests.poiproxy;

import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/browse?service={service}")
public class POIProxyBrowseEndPoint implements APIEndPoint {

	public POIProxyBrowseEndPoint() {

	}

//	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "service", optional = false)
	private String service = "panoramio";

	@APIParamAnnotation(name = "z")
	private String z = "0";

	@APIParamAnnotation(name = "x")
	private String x = "0";

	@APIParamAnnotation(name = "y")
	private String y = "0";

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
}