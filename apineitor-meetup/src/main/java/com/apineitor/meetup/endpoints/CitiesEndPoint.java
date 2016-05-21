package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/2/cities")
public class CitiesEndPoint extends DefaultParams implements APIEndPoint {

	private String country;
	private String query;
	private String lon;
	private String state;
	private String radius;
	private String lat;

	public CitiesEndPoint() {
		super();
	}

	public CitiesEndPoint(String fields, String order, String page, String offset, String desc, String only,
			String omit) {
		super(fields, order, page, offset, desc, only, omit);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
}
