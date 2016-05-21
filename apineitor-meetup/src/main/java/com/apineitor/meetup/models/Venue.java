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
public class Venue implements APIResponse {

	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("localized_country_name")
	@Expose
	private String localizedCountryName;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("address_1")
	@Expose
	private String address1;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("lon")
	@Expose
	private Double lon;
	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("lat")
	@Expose
	private Double lat;
	@SerializedName("repinned")
	@Expose
	private Boolean repinned;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Venue() {
	}

	/**
	 * 
	 * @param id
	 * @param lon
	 * @param repinned
	 * @param name
	 * @param address1
	 * @param lat
	 * @param city
	 * @param localizedCountryName
	 * @param country
	 */
	public Venue(String country, String localizedCountryName, String city, String address1, String name, Double lon,
			Long id, Double lat, Boolean repinned) {
		this.country = country;
		this.localizedCountryName = localizedCountryName;
		this.city = city;
		this.address1 = address1;
		this.name = name;
		this.lon = lon;
		this.id = id;
		this.lat = lat;
		this.repinned = repinned;
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
	 * @return The address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * 
	 * @param address1
	 *            The address_1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
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
	 * @return The repinned
	 */
	public Boolean getRepinned() {
		return repinned;
	}

	/**
	 * 
	 * @param repinned
	 *            The repinned
	 */
	public void setRepinned(Boolean repinned) {
		this.repinned = repinned;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(country).append(localizedCountryName).append(city).append(address1)
				.append(name).append(lon).append(id).append(lat).append(repinned).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Venue) == false) {
			return false;
		}
		Venue rhs = ((Venue) other);
		return new EqualsBuilder().append(country, rhs.country).append(localizedCountryName, rhs.localizedCountryName)
				.append(city, rhs.city).append(address1, rhs.address1).append(name, rhs.name).append(lon, rhs.lon)
				.append(id, rhs.id).append(lat, rhs.lat).append(repinned, rhs.repinned).isEquals();
	}

}