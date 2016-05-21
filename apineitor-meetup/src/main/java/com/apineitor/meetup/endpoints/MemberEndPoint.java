package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/members/{id}")
public class MemberEndPoint extends DefaultParams implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "id", optional = false)
	private String eventId;

	public MemberEndPoint(String eventId) {
		super();
		this.eventId = eventId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

}
