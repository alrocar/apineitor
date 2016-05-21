package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PhotoAlbum implements APIResponse {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("photo_count")
	@Expose
	private Long photoCount;
	@SerializedName("event")
	@Expose
	private Event event;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PhotoAlbum() {
	}

	/**
	 * 
	 * @param id
	 * @param title
	 * @param event
	 * @param photoCount
	 */
	public PhotoAlbum(Long id, String title, Long photoCount, Event event) {
		this.id = id;
		this.title = title;
		this.photoCount = photoCount;
		this.event = event;
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
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The photoCount
	 */
	public Long getPhotoCount() {
		return photoCount;
	}

	/**
	 * 
	 * @param photoCount
	 *            The photo_count
	 */
	public void setPhotoCount(Long photoCount) {
		this.photoCount = photoCount;
	}

	/**
	 * 
	 * @return The event
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * 
	 * @param event
	 *            The event
	 */
	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(title)
				.append(photoCount).append(event).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PhotoAlbum) == false) {
			return false;
		}
		PhotoAlbum rhs = ((PhotoAlbum) other);
		return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title)
				.append(photoCount, rhs.photoCount).append(event, rhs.event)
				.isEquals();
	}

}