package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/2/event_ratings")
public class EventRatingsEndPoint extends DefaultParams implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = true, isTemplateParam = false, name = "event_id", optional = false)
	private String eventId;

	@APIParamAnnotation(isQueryParam = true, isTemplateParam = false, name = "member_id", optional = false)
	private String memberId;

	public EventRatingsEndPoint(String eventId, String memberId) {
		super();
		this.eventId = eventId;
		this.memberId = memberId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
