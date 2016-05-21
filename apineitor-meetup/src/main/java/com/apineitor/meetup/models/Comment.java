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
public class Comment implements APIResponse {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("like_count")
    @Expose
    private Long likeCount;
    @SerializedName("member")
    @Expose
    private Member member;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comment() {
    }

    /**
     * 
     * @param member
     * @param id
     * @param likeCount
     * @param created
     * @param link
     * @param comment
     */
    public Comment(Long id, String comment, String link, Long created,
            Long likeCount, Member member) {
        this.id = id;
        this.comment = comment;
        this.link = link;
        this.created = created;
        this.likeCount = likeCount;
        this.member = member;
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
     * @return The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *            The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * @return The likeCount
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * 
     * @param likeCount
     *            The like_count
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
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
        return new HashCodeBuilder().append(id).append(comment).append(link)
                .append(created).append(likeCount).append(member).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comment) == false) {
            return false;
        }
        Comment rhs = ((Comment) other);
        return new EqualsBuilder().append(id, rhs.id)
                .append(comment, rhs.comment).append(link, rhs.link)
                .append(created, rhs.created).append(likeCount, rhs.likeCount)
                .append(member, rhs.member).isEquals();
    }

}