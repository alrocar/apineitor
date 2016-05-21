package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RSVP implements APIResponse {

	@SerializedName("created")
	@Expose
	private Long created;
	@SerializedName("updated")
	@Expose
	private Long updated;
	@SerializedName("response")
	@Expose
	private String response;
	@SerializedName("guests")
	@Expose
	private Long guests;
	@SerializedName("event")
	@Expose
	private Event event;
	@SerializedName("group")
	@Expose
	private Group group;
	@SerializedName("member")
	@Expose
	private Member member;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RSVP() {
	}

	/**
	 * 
	 * @param member
	 * @param response
	 * @param updated
	 * @param created
	 * @param event
	 * @param guests
	 * @param group
	 */
	public RSVP(Long created, Long updated, String response, Long guests,
			Event event, Group group, Member member) {
		this.created = created;
		this.updated = updated;
		this.response = response;
		this.guests = guests;
		this.event = event;
		this.group = group;
		this.member = member;
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
	 * @return The response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * 
	 * @param response
	 *            The response
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * 
	 * @return The guests
	 */
	public Long getGuests() {
		return guests;
	}

	/**
	 * 
	 * @param guests
	 *            The guests
	 */
	public void setGuests(Long guests) {
		this.guests = guests;
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

	/**
	 * 
	 * @return The group
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * 
	 * @param group
	 *            The group
	 */
	public void setGroup(Group group) {
		this.group = group;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(created).append(updated)
				.append(response).append(guests).append(event).append(group)
				.append(member).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RSVP) == false) {
			return false;
		}
		RSVP rhs = ((RSVP) other);
		return new EqualsBuilder().append(created, rhs.created)
				.append(updated, rhs.updated).append(response, rhs.response)
				.append(guests, rhs.guests).append(event, rhs.event)
				.append(group, rhs.group).append(member, rhs.member).isEquals();
	}

}