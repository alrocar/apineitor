package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class KeyPhoto implements APIResponse {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("highres_link")
	@Expose
	private String highresLink;
	@SerializedName("photo_link")
	@Expose
	private String photoLink;
	@SerializedName("thumb_link")
	@Expose
	private String thumbLink;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public KeyPhoto() {
	}

	/**
	 * 
	 * @param highresLink
	 * @param id
	 * @param photoLink
	 * @param thumbLink
	 */
	public KeyPhoto(Long id, String highresLink, String photoLink,
			String thumbLink) {
		this.id = id;
		this.highresLink = highresLink;
		this.photoLink = photoLink;
		this.thumbLink = thumbLink;
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
	 * @return The highresLink
	 */
	public String getHighresLink() {
		return highresLink;
	}

	/**
	 * 
	 * @param highresLink
	 *            The highres_link
	 */
	public void setHighresLink(String highresLink) {
		this.highresLink = highresLink;
	}

	/**
	 * 
	 * @return The photoLink
	 */
	public String getPhotoLink() {
		return photoLink;
	}

	/**
	 * 
	 * @param photoLink
	 *            The photo_link
	 */
	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

	/**
	 * 
	 * @return The thumbLink
	 */
	public String getThumbLink() {
		return thumbLink;
	}

	/**
	 * 
	 * @param thumbLink
	 *            The thumb_link
	 */
	public void setThumbLink(String thumbLink) {
		this.thumbLink = thumbLink;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(highresLink)
				.append(photoLink).append(thumbLink).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof KeyPhoto) == false) {
			return false;
		}
		KeyPhoto rhs = ((KeyPhoto) other);
		return new EqualsBuilder().append(id, rhs.id)
				.append(highresLink, rhs.highresLink)
				.append(photoLink, rhs.photoLink)
				.append(thumbLink, rhs.thumbLink).isEquals();
	}

}