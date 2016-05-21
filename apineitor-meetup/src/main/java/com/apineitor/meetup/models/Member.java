package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Member implements APIResponse {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("bio")
	@Expose
	private String bio;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("joined")
	@Expose
	private Long joined;
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
	@SerializedName("lat")
	@Expose
	private Double lat;
	@SerializedName("lon")
	@Expose
	private Double lon;
	@SerializedName("photo")
	@Expose
	private Photo photo;
	@SerializedName("group_profile")
	@Expose
	private GroupProfile groupProfile;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Member() {
	}

	/**
	 * 
	 * @param id
	 * @param lon
	 * @param joined
	 * @param bio
	 * @param status
	 * @param name
	 * @param state
	 * @param groupProfile
	 * @param photo
	 * @param lat
	 * @param localizedCountryName
	 * @param country
	 * @param city
	 */
	public Member(Long id, String name, String bio, String status, Long joined,
			String city, String country, String localizedCountryName,
			String state, Double lat, Double lon, Photo photo,
			GroupProfile groupProfile) {
		this.id = id;
		this.name = name;
		this.bio = bio;
		this.status = status;
		this.joined = joined;
		this.city = city;
		this.country = country;
		this.localizedCountryName = localizedCountryName;
		this.state = state;
		this.lat = lat;
		this.lon = lon;
		this.photo = photo;
		this.groupProfile = groupProfile;
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
	 * @return The bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * 
	 * @param bio
	 *            The bio
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * 
	 * @return The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *            The status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 
	 * @return The joined
	 */
	public Long getJoined() {
		return joined;
	}

	/**
	 * 
	 * @param joined
	 *            The joined
	 */
	public void setJoined(Long joined) {
		this.joined = joined;
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
	 * @return The photo
	 */
	public Photo getPhoto() {
		return photo;
	}

	/**
	 * 
	 * @param photo
	 *            The photo
	 */
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	/**
	 * 
	 * @return The groupProfile
	 */
	public GroupProfile getGroupProfile() {
		return groupProfile;
	}

	/**
	 * 
	 * @param groupProfile
	 *            The group_profile
	 */
	public void setGroupProfile(GroupProfile groupProfile) {
		this.groupProfile = groupProfile;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(bio)
				.append(status).append(joined).append(city).append(country)
				.append(localizedCountryName).append(state).append(lat)
				.append(lon).append(photo).append(groupProfile).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Member) == false) {
			return false;
		}
		Member rhs = ((Member) other);
		return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name)
				.append(bio, rhs.bio).append(status, rhs.status)
				.append(joined, rhs.joined).append(city, rhs.city)
				.append(country, rhs.country)
				.append(localizedCountryName, rhs.localizedCountryName)
				.append(state, rhs.state).append(lat, rhs.lat)
				.append(lon, rhs.lon).append(photo, rhs.photo)
				.append(groupProfile, rhs.groupProfile).isEquals();
	}

}