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

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class City implements APIResponse {

	@SerializedName("zip")
	@Expose
	private String zip;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("localized_country_name")
	@Expose
	private String localizedCountryName;
	@SerializedName("distance")
	@Expose
	private Double distance;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("lon")
	@Expose
	private Double lon;
	@SerializedName("ranking")
	@Expose
	private Integer ranking;
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("member_count")
	@Expose
	private Integer memberCount;
	@SerializedName("lat")
	@Expose
	private Double lat;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public City() {
	}

	/**
	 * 
	 * @param id
	 * @param zip
	 * @param lon
	 * @param distance
	 * @param ranking
	 * @param lat
	 * @param memberCount
	 * @param city
	 * @param localizedCountryName
	 * @param country
	 */
	public City(String zip, String country, String localizedCountryName,
			Double distance, String city, Double lon, Integer ranking,
			Integer id, Integer memberCount, Double lat) {
		this.zip = zip;
		this.country = country;
		this.localizedCountryName = localizedCountryName;
		this.distance = distance;
		this.city = city;
		this.lon = lon;
		this.ranking = ranking;
		this.id = id;
		this.memberCount = memberCount;
		this.lat = lat;
	}

	/**
	 * 
	 * @return The zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * 
	 * @param zip
	 *            The zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
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
	 * @return The distance
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 *            The distance
	 */
	public void setDistance(Double distance) {
		this.distance = distance;
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
	 * @return The ranking
	 */
	public Integer getRanking() {
		return ranking;
	}

	/**
	 * 
	 * @param ranking
	 *            The ranking
	 */
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	/**
	 * 
	 * @return The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The memberCount
	 */
	public Integer getMemberCount() {
		return memberCount;
	}

	/**
	 * 
	 * @param memberCount
	 *            The member_count
	 */
	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(zip).append(country)
				.append(localizedCountryName).append(distance).append(city)
				.append(lon).append(ranking).append(id).append(memberCount)
				.append(lat).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof City) == false) {
			return false;
		}
		City rhs = ((City) other);
		return new EqualsBuilder().append(zip, rhs.zip)
				.append(country, rhs.country)
				.append(localizedCountryName, rhs.localizedCountryName)
				.append(distance, rhs.distance).append(city, rhs.city)
				.append(lon, rhs.lon).append(ranking, rhs.ranking)
				.append(id, rhs.id).append(memberCount, rhs.memberCount)
				.append(lat, rhs.lat).isEquals();
	}

}