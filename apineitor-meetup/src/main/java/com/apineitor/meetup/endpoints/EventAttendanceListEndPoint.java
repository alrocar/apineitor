package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/{urlname}/events/{id}/attendance")
public class EventAttendanceListEndPoint extends DefaultParams implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "urlname", optional = false)
	private String urlName;

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "id", optional = false)
	private String eventId;

	private String filter;
	private String member;

	public EventAttendanceListEndPoint(String urlName, String eventId) {
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

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

}
