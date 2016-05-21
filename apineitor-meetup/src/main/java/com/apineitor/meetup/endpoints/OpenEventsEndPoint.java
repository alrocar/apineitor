package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/2/open_events")
public class OpenEventsEndPoint extends DefaultParams implements APIEndPoint {

	private String lon;
	private String lat;
	private String and_text;
	private String zip;
	private String country;
	private String topic;
	private String city;
	private String limited_events;
	private String text_format;
	private String state;
	private String text;
	private String category;
	private String time;
	private String radius;

	public OpenEventsEndPoint() {
		super();
	}

	public OpenEventsEndPoint(String lon, String lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getAnd_text() {
		return and_text;
	}

	public void setAnd_text(String and_text) {
		this.and_text = and_text;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLimited_events() {
		return limited_events;
	}

	public void setLimited_events(String limited_events) {
		this.limited_events = limited_events;
	}

	public String getText_format() {
		return text_format;
	}

	public void setText_format(String text_format) {
		this.text_format = text_format;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

}
