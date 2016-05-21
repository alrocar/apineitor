package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EventContext implements APIResponse {

	@SerializedName("host")
	@Expose
	private Boolean host;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public EventContext() {
	}

	/**
	 * 
	 * @param host
	 */
	public EventContext(Boolean host) {
		this.host = host;
	}

	/**
	 * 
	 * @return The host
	 */
	public Boolean getHost() {
		return host;
	}

	/**
	 * 
	 * @param host
	 *            The host
	 */
	public void setHost(Boolean host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(host).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof EventContext) == false) {
			return false;
		}
		EventContext rhs = ((EventContext) other);
		return new EqualsBuilder().append(host, rhs.host).isEquals();
	}

}