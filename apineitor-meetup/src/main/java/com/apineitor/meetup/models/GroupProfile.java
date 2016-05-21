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
public class GroupProfile implements APIResponse {

	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("visited")
	@Expose
	private Long visited;
	@SerializedName("created")
	@Expose
	private Long created;
	@SerializedName("updated")
	@Expose
	private Long updated;
	@SerializedName("role")
	@Expose
	private String role;
	@SerializedName("group")
	@Expose
	private Group group;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public GroupProfile() {
	}

	/**
	 * 
	 * @param visited
	 * @param updated
	 * @param created
	 * @param status
	 * @param role
	 * @param group
	 */
	public GroupProfile(String status, Long visited, Long created,
			Long updated, String role, Group group) {
		this.status = status;
		this.visited = visited;
		this.created = created;
		this.updated = updated;
		this.role = role;
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

	/**
	 * 
	 * @return The visited
	 */
	public Long getVisited() {
		return visited;
	}

	/**
	 * 
	 * @param visited
	 *            The visited
	 */
	public void setVisited(Long visited) {
		this.visited = visited;
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
	 * @return The role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * 
	 * @param role
	 *            The role
	 */
	public void setRole(String role) {
		this.role = role;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(status).append(visited)
				.append(created).append(updated).append(role).append(group)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GroupProfile) == false) {
			return false;
		}
		GroupProfile rhs = ((GroupProfile) other);
		return new EqualsBuilder().append(status, rhs.status)
				.append(visited, rhs.visited).append(created, rhs.created)
				.append(updated, rhs.updated).append(role, rhs.role)
				.append(group, rhs.group).isEquals();
	}

}