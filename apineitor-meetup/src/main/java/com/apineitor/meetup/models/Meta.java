package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Meta implements APIResponse {

    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("total_count")
    @Expose
    private Long totalCount;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated")
    @Expose
    private Long updated;
    @SerializedName("lat")
    @Expose
    private String lat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param id
     * @param title
     * @param lon
     * @param count
     * @param updated
     * @param totalCount
     * @param description
     * @param link
     * @param next
     * @param method
     * @param lat
     * @param url
     */
    public Meta(String next, String method, Long totalCount, String link,
            Long count, String description, String lon, String title,
            String url, String id, Long updated, String lat) {
        this.next = next;
        this.method = method;
        this.totalCount = totalCount;
        this.link = link;
        this.count = count;
        this.description = description;
        this.lon = lon;
        this.title = title;
        this.url = url;
        this.id = id;
        this.updated = updated;
        this.lat = lat;
    }

    /**
     * 
     * @return The next
     */
    public String getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *            The next
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * @return The method
     */
    public String getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     *            The method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 
     * @return The totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * @param totalCount
     *            The total_count
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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
     * @return The count
     */
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *            The count
     */
    public void setCount(Long count) {
        this.count = count;
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
     * @return The lon
     */
    public String getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *            The lon
     */
    public void setLon(String lon) {
        this.lon = lon;
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
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *            The url
     */
    public void setUrl(String url) {
        this.url = url;
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
     * @return The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *            The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(next).append(method)
                .append(totalCount).append(link).append(count)
                .append(description).append(lon).append(title).append(url)
                .append(id).append(updated).append(lat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(next, rhs.next)
                .append(method, rhs.method).append(totalCount, rhs.totalCount)
                .append(link, rhs.link).append(count, rhs.count)
                .append(description, rhs.description).append(lon, rhs.lon)
                .append(title, rhs.title).append(url, rhs.url)
                .append(id, rhs.id).append(updated, rhs.updated)
                .append(lat, rhs.lat).isEquals();
    }

}