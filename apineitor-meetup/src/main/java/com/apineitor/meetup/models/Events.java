package com.apineitor.meetup.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Events implements APIResponse {

	@SerializedName("results")
	@Expose
	private List<Event> results = new ArrayList<Event>();
	@SerializedName("meta")
	@Expose
	private Meta meta;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Events() {
	}

	/**
	 * 
	 * @param results
	 * @param meta
	 */
	public Events(List<Event> results, Meta meta) {
		this.results = results;
		this.meta = meta;
	}

	/**
	 * 
	 * @return The results
	 */
	public List<Event> getResults() {
		return results;
	}

	/**
	 * 
	 * @param results
	 *            The results
	 */
	public void setResults(List<Event> results) {
		this.results = results;
	}

	/**
	 * 
	 * @return The meta
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * 
	 * @param meta
	 *            The meta
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(results).append(meta).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Events) == false) {
			return false;
		}
		Events rhs = ((Events) other);
		return new EqualsBuilder().append(results, rhs.results)
				.append(meta, rhs.meta).isEquals();
	}

}