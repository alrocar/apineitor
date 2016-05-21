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
public class Organizer implements APIResponse {

	@SerializedName("member_id")
	@Expose
	private Long memberId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("photo")
	@Expose
	private Photo photo;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Organizer() {
	}

	/**
	 * 
	 * @param name
	 * @param memberId
	 * @param photo
	 */
	public Organizer(Long memberId, String name, Photo photo) {
		this.memberId = memberId;
		this.name = name;
		this.photo = photo;
	}

	/**
	 * 
	 * @return The memberId
	 */
	public Long getMemberId() {
		return memberId;
	}

	/**
	 * 
	 * @param memberId
	 *            The member_id
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(memberId).append(name)
				.append(photo).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Organizer) == false) {
			return false;
		}
		Organizer rhs = ((Organizer) other);
		return new EqualsBuilder().append(memberId, rhs.memberId)
				.append(name, rhs.name).append(photo, rhs.photo).isEquals();
	}

}