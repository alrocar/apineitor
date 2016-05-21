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
public class Event implements APIResponse {

	@SerializedName("utc_offset")
	@Expose
	private Long utcOffset;
	@SerializedName("venue")
	@Expose
	private Venue venue;
	@SerializedName("headcount")
	@Expose
	private Long headcount;
	@SerializedName("distance")
	@Expose
	private Double distance;
	@SerializedName("visibility")
	@Expose
	private String visibility;
	@SerializedName("waitlist_count")
	@Expose
	private Long waitlistCount;
	@SerializedName("created")
	@Expose
	private Long created;
	@SerializedName("maybe_rsvp_count")
	@Expose
	private Long maybeRsvpCount;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("event_url")
	@Expose
	private String eventUrl;
	@SerializedName("yes_rsvp_count")
	@Expose
	private Long yesRsvpCount;
	@SerializedName("duration")
	@Expose
	private Long duration;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("time")
	@Expose
	private Long time;
	@SerializedName("updated")
	@Expose
	private Long updated;
	@SerializedName("group")
	@Expose
	private Group group;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("link")
	@Expose
	private String link;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Event() {
	}

	/**
	 * 
	 * @param status
	 * @param visibility
	 * @param eventUrl
	 * @param venue
	 * @param id
	 * @param time
	 * @param distance
	 * @param duration
	 * @param updated
	 * @param created
	 * @param maybeRsvpCount
	 * @param description
	 * @param name
	 * @param headcount
	 * @param utcOffset
	 * @param waitlistCount
	 * @param yesRsvpCount
	 * @param group
	 * @param link
	 */
	public Event(Long utcOffset, Venue venue, Long headcount, Double distance,
			String visibility, Long waitlistCount, Long created,
			Long maybeRsvpCount, String description, String eventUrl,
			Long yesRsvpCount, Long duration, String name, String id,
			Long time, Long updated, Group group, String status, String link) {
		this.utcOffset = utcOffset;
		this.venue = venue;
		this.headcount = headcount;
		this.distance = distance;
		this.visibility = visibility;
		this.waitlistCount = waitlistCount;
		this.created = created;
		this.maybeRsvpCount = maybeRsvpCount;
		this.description = description;
		this.eventUrl = eventUrl;
		this.yesRsvpCount = yesRsvpCount;
		this.duration = duration;
		this.name = name;
		this.id = id;
		this.time = time;
		this.updated = updated;
		this.group = group;
		this.status = status;
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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
	 * @return The venue
	 */
	public Venue getVenue() {
		return venue;
	}

	/**
	 * 
	 * @param venue
	 *            The venue
	 */
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	/**
	 * 
	 * @return The headcount
	 */
	public Long getHeadcount() {
		return headcount;
	}

	/**
	 * 
	 * @param headcount
	 *            The headcount
	 */
	public void setHeadcount(Long headcount) {
		this.headcount = headcount;
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
	 * @return The waitlistCount
	 */
	public Long getWaitlistCount() {
		return waitlistCount;
	}

	/**
	 * 
	 * @param waitlistCount
	 *            The waitlist_count
	 */
	public void setWaitlistCount(Long waitlistCount) {
		this.waitlistCount = waitlistCount;
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
	 * @return The maybeRsvpCount
	 */
	public Long getMaybeRsvpCount() {
		return maybeRsvpCount;
	}

	/**
	 * 
	 * @param maybeRsvpCount
	 *            The maybe_rsvp_count
	 */
	public void setMaybeRsvpCount(Long maybeRsvpCount) {
		this.maybeRsvpCount = maybeRsvpCount;
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
	 * @return The eventUrl
	 */
	public String getEventUrl() {
		return eventUrl;
	}

	/**
	 * 
	 * @param eventUrl
	 *            The event_url
	 */
	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	/**
	 * 
	 * @return The yesRsvpCount
	 */
	public Long getYesRsvpCount() {
		return yesRsvpCount;
	}

	/**
	 * 
	 * @param yesRsvpCount
	 *            The yes_rsvp_count
	 */
	public void setYesRsvpCount(Long yesRsvpCount) {
		this.yesRsvpCount = yesRsvpCount;
	}

	/**
	 * 
	 * @return The duration
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * 
	 * @param duration
	 *            The duration
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
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
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(utcOffset).append(venue)
				.append(headcount).append(distance).append(visibility)
				.append(waitlistCount).append(created).append(maybeRsvpCount)
				.append(description).append(eventUrl).append(yesRsvpCount)
				.append(duration).append(name).append(id).append(time)
				.append(updated).append(group).append(status).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Event) == false) {
			return false;
		}
		Event rhs = ((Event) other);
		return new EqualsBuilder().append(utcOffset, rhs.utcOffset)
				.append(venue, rhs.venue).append(headcount, rhs.headcount)
				.append(distance, rhs.distance)
				.append(visibility, rhs.visibility)
				.append(waitlistCount, rhs.waitlistCount)
				.append(created, rhs.created)
				.append(maybeRsvpCount, rhs.maybeRsvpCount)
				.append(description, rhs.description)
				.append(eventUrl, rhs.eventUrl)
				.append(yesRsvpCount, rhs.yesRsvpCount)
				.append(duration, rhs.duration).append(name, rhs.name)
				.append(id, rhs.id).append(time, rhs.time)
				.append(updated, rhs.updated).append(group, rhs.group)
				.append(status, rhs.status).isEquals();
	}

}