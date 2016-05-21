package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/{urlname}/events")
public class GroupEventsEndPoint extends DefaultParams implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "urlname", optional = false)
	private String urlName;

	private String fields;
	private String scroll;

	public GroupEventsEndPoint(String urlName) {
		super();
		this.urlName = urlName;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getScroll() {
		return scroll;
	}

	public void setScroll(String scroll) {
		this.scroll = scroll;
	}
}
