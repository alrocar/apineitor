package com.apineitor.meetup.endpoints;

import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/{urlname}/events/{id}")
public class GroupEventEndPoint implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "urlname", optional = false)
	private String urlName;

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "id", optional = false)
	private String eventId;

	private String fields;
	private String only;
	private String omit;

	public GroupEventEndPoint(String urlName, String eventId) {
		super();
		this.urlName = urlName;
		this.eventId = eventId;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getOnly() {
		return only;
	}

	public void setOnly(String only) {
		this.only = only;
	}

	public String getOmit() {
		return omit;
	}

	public void setOmit(String omit) {
		this.omit = omit;
	}
}
