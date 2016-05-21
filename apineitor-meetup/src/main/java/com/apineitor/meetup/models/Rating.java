package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Rating implements APIResponse {

	@SerializedName("member_id")
	@Expose
	private Long memberId;
	@SerializedName("event_id")
	@Expose
	private String eventId;
	@SerializedName("time")
	@Expose
	private Long time;
	@SerializedName("member_name")
	@Expose
	private String memberName;
	@SerializedName("group_id")
	@Expose
	private Long groupId;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Rating() {
	}

	/**
	 * 
	 * @param groupId
	 * @param time
	 * @param eventId
	 * @param memberId
	 * @param memberName
	 */
	public Rating(Long memberId, String eventId, Long time, String memberName,
			Long groupId) {
		this.memberId = memberId;
		this.eventId = eventId;
		this.time = time;
		this.memberName = memberName;
		this.groupId = groupId;
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
	 * @return The eventId
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * 
	 * @param eventId
	 *            The event_id
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	/**
	 * 
	 * @return The time
	 */
	public Long getTime() {
		return time;
	}

	/**
	 * 
	 * @param time
	 *            The time
	 */
	public void setTime(Long time) {
		this.time = time;
	}

	/**
	 * 
	 * @return The memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * 
	 * @param memberName
	 *            The member_name
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * 
	 * @return The groupId
	 */
	public Long getGroupId() {
		return groupId;
	}

	/**
	 * 
	 * @param groupId
	 *            The group_id
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(memberId).append(eventId)
				.append(time).append(memberName).append(groupId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Rating) == false) {
			return false;
		}
		Rating rhs = ((Rating) other);
		return new EqualsBuilder().append(memberId, rhs.memberId)
				.append(eventId, rhs.eventId).append(time, rhs.time)
				.append(memberName, rhs.memberName)
				.append(groupId, rhs.groupId).isEquals();
	}

}