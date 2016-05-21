package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/2/groups")
public class GroupsEndPoint extends DefaultParams implements APIEndPoint {

	private String topic;
	private String groupnum;
	private String zip;
	private String lat;
	private String lon;
	private String group_urlname;
	private String group_id;
	private String organizer_id;
	private String domain;
	private String radius;
	private String category_id;
	private String country;
	private String city;
	private String state;

	public GroupsEndPoint() {

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getGroupnum() {
		return groupnum;
	}

	public void setGroupnum(String groupnum) {
		this.groupnum = groupnum;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getGroup_urlname() {
		return group_urlname;
	}

	public void setGroup_urlname(String group_urlname) {
		this.group_urlname = group_urlname;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getOrganizer_id() {
		return organizer_id;
	}

	public void setOrganizer_id(String organizer_id) {
		this.organizer_id = organizer_id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
