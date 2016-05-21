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
public class Ratings implements APIResponse {

	@SerializedName("results")
	@Expose
	private List<Rating> results = new ArrayList<Rating>();
	@SerializedName("meta")
	@Expose
	private Meta meta;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Ratings() {
	}

	/**
	 * 
	 * @param Ratings
	 * @param meta
	 */
	public Ratings(List<Rating> Ratings, Meta meta) {
		this.results = Ratings;
		this.meta = meta;
	}

	/**
	 * 
	 * @return The Ratings
	 */
	public List<Rating> getRatings() {
		return results;
	}

	/**
	 * 
	 * @param Ratings
	 *            The Ratings
	 */
	public void setRatings(List<Rating> Ratings) {
		this.results = Ratings;
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
		if ((other instanceof Ratings) == false) {
			return false;
		}
		Ratings rhs = ((Ratings) other);
		return new EqualsBuilder().append(results, rhs.results)
				.append(meta, rhs.meta).isEquals();
	}

}