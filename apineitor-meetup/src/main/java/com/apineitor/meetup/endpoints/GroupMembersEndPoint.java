package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.models.APIParamAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/{urlname}/members")
public class GroupMembersEndPoint extends DefaultParams implements APIEndPoint {

	@APIParamAnnotation(isQueryParam = false, isTemplateParam = true, name = "urlname", optional = false)
	private String urlName;

	private String role;
	private String status;

	public GroupMembersEndPoint(String urlName) {
		super();
		this.urlName = urlName;
	}

	public GroupMembersEndPoint(String urlName, String role) {
		this(urlName);
		this.role = role;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
