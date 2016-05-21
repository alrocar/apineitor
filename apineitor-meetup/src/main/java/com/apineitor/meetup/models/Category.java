package com.apineitor.meetup.models;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.apineitor.models.APIResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Category implements APIResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sort_name")
    @Expose
    private String sortName;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("shortname")
    @Expose
    private String shortname;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param shortname
     * @param sortName
     */
    public Category(String name, String sortName, Long id, String shortname) {
        this.name = name;
        this.sortName = sortName;
        this.id = id;
        this.shortname = shortname;
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
     * @return The sortName
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * 
     * @param sortName
     *            The sort_name
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
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
     * @return The shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 
     * @param shortname
     *            The shortname
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(sortName).append(id)
                .append(shortname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return new EqualsBuilder().append(name, rhs.name)
                .append(sortName, rhs.sortName).append(id, rhs.id)
                .append(shortname, rhs.shortname).isEquals();
    }

}