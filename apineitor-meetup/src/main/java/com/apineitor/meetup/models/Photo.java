package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photo implements APIResponse {

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
	@SerializedName("link")
	@Expose
	private String link;
	@SerializedName("created")
	@Expose
	private Long created;
	@SerializedName("updated")
	@Expose
	private Long updated;
	@SerializedName("utc_offset")
	@Expose
	private Long utcOffset;
	@SerializedName("member")
	@Expose
	private Member member;
	@SerializedName("photo_album")
	@Expose
	private PhotoAlbum photoAlbum;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Photo() {
	}

	/**
	 * 
	 * @param member
	 * @param highresLink
	 * @param id
	 * @param updated
	 * @param created
	 * @param link
	 * @param photoAlbum
	 * @param photoLink
	 * @param utcOffset
	 * @param thumbLink
	 */
	public Photo(Long id, String highresLink, String photoLink,
			String thumbLink, String link, Long created, Long updated,
			Long utcOffset, Member member, PhotoAlbum photoAlbum) {
		this.id = id;
		this.highresLink = highresLink;
		this.photoLink = photoLink;
		this.thumbLink = thumbLink;
		this.link = link;
		this.created = created;
		this.updated = updated;
		this.utcOffset = utcOffset;
		this.member = member;
		this.photoAlbum = photoAlbum;
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
	 * @return The updated
	 */
	public Long getUpdated() {
		return updated;
	}

	/**
	 * 
	 * @param updated
	 *            The updated
	 */
	public void setUpdated(Long updated) {
		this.updated = updated;
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
	 * @return The member
	 */
	public Member getMember() {
		return member;
	}

	/**
	 * 
	 * @param member
	 *            The member
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * 
	 * @return The photoAlbum
	 */
	public PhotoAlbum getPhotoAlbum() {
		return photoAlbum;
	}

	/**
	 * 
	 * @param photoAlbum
	 *            The photo_album
	 */
	public void setPhotoAlbum(PhotoAlbum photoAlbum) {
		this.photoAlbum = photoAlbum;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(highresLink)
				.append(photoLink).append(thumbLink).append(link)
				.append(created).append(updated).append(utcOffset)
				.append(member).append(photoAlbum).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Photo) == false) {
			return false;
		}
		Photo rhs = ((Photo) other);
		return new EqualsBuilder().append(id, rhs.id)
				.append(highresLink, rhs.highresLink)
				.append(photoLink, rhs.photoLink)
				.append(thumbLink, rhs.thumbLink).append(link, rhs.link)
				.append(created, rhs.created).append(updated, rhs.updated)
				.append(utcOffset, rhs.utcOffset).append(member, rhs.member)
				.append(photoAlbum, rhs.photoAlbum).isEquals();
	}

}