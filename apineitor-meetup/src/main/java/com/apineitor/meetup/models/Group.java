/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 Alberto Romeu
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package com.apineitor.meetup.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Group implements APIResponse {

	@SerializedName("group_lon")
	@Expose
	private Double groupLon;
	@SerializedName("group_lat")
	@Expose
	private Double groupLat;
	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("link")
	@Expose
	private String link;
	@SerializedName("urlname")
	@Expose
	private String urlname;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("created")
	@Expose
	private Long created;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("localized_country_name")
	@Expose
	private String localizedCountryName;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("join_mode")
	@Expose
	private String joinMode;
	@SerializedName("visibility")
	@Expose
	private String visibility;
	@SerializedName("lat")
	@Expose
	private Double lat;
	@SerializedName("lon")
	@Expose
	private Double lon;
	@SerializedName("members")
	@Expose
	private Long members;
	@SerializedName("who")
	@Expose
	private String who;
	@SerializedName("group_photo")
	@Expose
	private GroupPhoto groupPhoto;
	@SerializedName("key_photo")
	@Expose
	private KeyPhoto keyPhoto;
	@SerializedName("timezone")
	@Expose
	private String timezone;
	@SerializedName("category")
	@Expose
	private Category category;
	@SerializedName("photos")
	@Expose
	private List<Photo> photos = new ArrayList<Photo>();
	@SerializedName("utc_offset")
	@Expose
	private Long utcOffset;
	@SerializedName("topics")
	@Expose
	private List<Topic> topics = new ArrayList<Topic>();
	@SerializedName("rating")
	@Expose
	private Double rating;
	@SerializedName("organizer")
	@Expose
	private Organizer organizer;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Group() {
	}

	/**
	 * 
	 * @param id
	 * @param groupLat
	 * @param created
	 * @param name
	 * @param joinMode
	 * @param urlname
	 * @param who
	 * @param groupLon
	 */
	public Group(String joinMode, Long created, String name, Double groupLon,
			Long id, String urlname, Double groupLat, String who) {
		this.joinMode = joinMode;
		this.created = created;
		this.name = name;
		this.groupLon = groupLon;
		this.id = id;
		this.urlname = urlname;
		this.groupLat = groupLat;
		this.who = who;
	}

	/**
	 * 
	 * @param id
	 * @param lon
	 * @param created
	 * @param name
	 * @param joinMode
	 * @param urlname
	 * @param lat
	 * @param who
	 */
	public Group(Long created, String name, Long id, String joinMode,
			Double lat, Double lon, String urlname, String who) {
		this.created = created;
		this.name = name;
		this.id = id;
		this.joinMode = joinMode;
		this.lat = lat;
		this.lon = lon;
		this.urlname = urlname;
		this.who = who;
	}

	/**
	 * 
	 * @return The joinMode
	 */
	public String getJoinMode() {
		return joinMode;
	}

	/**
	 * 
	 * @param joinMode
	 *            The join_mode
	 */
	public void setJoinMode(String joinMode) {
		this.joinMode = joinMode;
	}

	/**
	 * 
	 * @return The created
	 */
	public Long getCreated() {
		return created;
	}

	/**
	 * 
	 * @param created
	 *            The created
	 */
	public void setCreated(Long created) {
		this.created = created;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The groupLon
	 */
	public Double getGroupLon() {
		return groupLon;
	}

	/**
	 * 
	 * @param groupLon
	 *            The group_lon
	 */
	public void setGroupLon(Double groupLon) {
		this.groupLon = groupLon;
	}

	/**
	 * 
	 * @return The id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The urlname
	 */
	public String getUrlname() {
		return urlname;
	}

	/**
	 * 
	 * @param urlname
	 *            The urlname
	 */
	public void setUrlname(String urlname) {
		this.urlname = urlname;
	}

	/**
	 * 
	 * @return The groupLat
	 */
	public Double getGroupLat() {
		return groupLat;
	}

	/**
	 * 
	 * @param groupLat
	 *            The group_lat
	 */
	public void setGroupLat(Double groupLat) {
		this.groupLat = groupLat;
	}

	/**
	 * 
	 * @return The who
	 */
	public String getWho() {
		return who;
	}

	/**
	 * 
	 * @return The lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * 
	 * @param lat
	 *            The lat
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * 
	 * @return The lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * 
	 * @param lon
	 *            The lon
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

	/**
	 * 
	 * @param who
	 *            The who
	 */
	public void setWho(String who) {
		this.who = who;
	}

	/**
	 * 
	 * @return The link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * 
	 * @param link
	 *            The link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * 
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return The city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 *            The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The localizedCountryName
	 */
	public String getLocalizedCountryName() {
		return localizedCountryName;
	}

	/**
	 * 
	 * @param localizedCountryName
	 *            The localized_country_name
	 */
	public void setLocalizedCountryName(String localizedCountryName) {
		this.localizedCountryName = localizedCountryName;
	}

	/**
	 * 
	 * @return The state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return The visibility
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * 
	 * @param visibility
	 *            The visibility
	 */
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	/**
	 * 
	 * @return The members
	 */
	public Long getMembers() {
		return members;
	}

	/**
	 * 
	 * @param members
	 *            The members
	 */
	public void setMembers(Long members) {
		this.members = members;
	}

	/**
	 * 
	 * @return The groupPhoto
	 */
	public GroupPhoto getGroupPhoto() {
		return groupPhoto;
	}

	/**
	 * 
	 * @param groupPhoto
	 *            The group_photo
	 */
	public void setGroupPhoto(GroupPhoto groupPhoto) {
		this.groupPhoto = groupPhoto;
	}

	/**
	 * 
	 * @return The keyPhoto
	 */
	public KeyPhoto getKeyPhoto() {
		return keyPhoto;
	}

	/**
	 * 
	 * @param keyPhoto
	 *            The key_photo
	 */
	public void setKeyPhoto(KeyPhoto keyPhoto) {
		this.keyPhoto = keyPhoto;
	}

	/**
	 * 
	 * @return The timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * 
	 * @param timezone
	 *            The timezone
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * 
	 * @return The category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * 
	 * @param category
	 *            The category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * 
	 * @return The photos
	 */
	public List<Photo> getPhotos() {
		return photos;
	}

	/**
	 * 
	 * @param photos
	 *            The photos
	 */
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	/**
	 * 
	 * @return The utcOffset
	 */
	public Long getUtcOffset() {
		return utcOffset;
	}

	/**
	 * 
	 * @param utcOffset
	 *            The utc_offset
	 */
	public void setUtcOffset(Long utcOffset) {
		this.utcOffset = utcOffset;
	}

	/**
	 * 
	 * @return The topics
	 */
	public List<Topic> getTopics() {
		return topics;
	}

	/**
	 * 
	 * @param topics
	 *            The topics
	 */
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	/**
	 * 
	 * @return The rating
	 */
	public Double getRating() {
		return rating;
	}

	/**
	 * 
	 * @param rating
	 *            The rating
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}

	/**
	 * 
	 * @return The organizer
	 */
	public Organizer getOrganizer() {
		return organizer;
	}

	/**
	 * 
	 * @param organizer
	 *            The organizer
	 */
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(link)
				.append(urlname).append(description).append(created)
				.append(city).append(country).append(localizedCountryName)
				.append(state).append(joinMode).append(visibility).append(lat)
				.append(lon).append(members).append(who).append(groupPhoto)
				.append(keyPhoto).append(timezone).append(category)
				.append(photos).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Group) == false) {
			return false;
		}
		Group rhs = ((Group) other);
		return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name)
				.append(link, rhs.link).append(urlname, rhs.urlname)
				.append(description, rhs.description)
				.append(created, rhs.created).append(city, rhs.city)
				.append(country, rhs.country)
				.append(localizedCountryName, rhs.localizedCountryName)
				.append(state, rhs.state).append(joinMode, rhs.joinMode)
				.append(visibility, rhs.visibility).append(lat, rhs.lat)
				.append(lon, rhs.lon).append(members, rhs.members)
				.append(who, rhs.who).append(groupPhoto, rhs.groupPhoto)
				.append(keyPhoto, rhs.keyPhoto).append(timezone, rhs.timezone)
				.append(category, rhs.category).append(photos, rhs.photos)
				.isEquals();
	}

}