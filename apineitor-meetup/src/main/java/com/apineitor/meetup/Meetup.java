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
package com.apineitor.meetup;

import com.apineitor.http.APIException;
import com.apineitor.meetup.controllers.MeetupController;
import com.apineitor.meetup.endpoints.CategoriesEndPoint;
import com.apineitor.meetup.endpoints.CitiesEndPoint;
import com.apineitor.meetup.endpoints.EventRatingsEndPoint;
import com.apineitor.meetup.endpoints.GroupEventCommentsListEndPoint;
import com.apineitor.meetup.endpoints.GroupEventEndPoint;
import com.apineitor.meetup.endpoints.GroupEventPhotosEndPoint;
import com.apineitor.meetup.endpoints.GroupEventRSVPEndPoint;
import com.apineitor.meetup.endpoints.GroupEventsEndPoint;
import com.apineitor.meetup.endpoints.GroupMemberEndPoint;
import com.apineitor.meetup.endpoints.GroupMembersEndPoint;
import com.apineitor.meetup.endpoints.GroupsEndPoint;
import com.apineitor.meetup.endpoints.MemberEndPoint;
import com.apineitor.meetup.endpoints.OpenEventsEndPoint;
import com.apineitor.meetup.endpoints.SimilarGroupsEndPoint;
import com.apineitor.meetup.models.Categories;
import com.apineitor.meetup.models.Cities;
import com.apineitor.meetup.models.CommentList;
import com.apineitor.meetup.models.Event;
import com.apineitor.meetup.models.EventList;
import com.apineitor.meetup.models.Events;
import com.apineitor.meetup.models.GroupList;
import com.apineitor.meetup.models.Groups;
import com.apineitor.meetup.models.Member;
import com.apineitor.meetup.models.MemberList;
import com.apineitor.meetup.models.PhotoList;
import com.apineitor.meetup.models.RSVPList;
import com.apineitor.meetup.models.Ratings;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIResponse;

public class Meetup {

	private MeetupController controller;

	public Meetup(MeetupConfiguration configuration) {
		controller = new MeetupController(configuration, APIResponse.class);
	}

	public APIResponse get(APIEndPoint endPoint, Class<?> responseType) throws APIException {
		return controller.get(endPoint, responseType);
	}

	public Events getOpenEvents(OpenEventsEndPoint endPoint) throws APIException {
		return (Events) this.get(endPoint, Events.class);
	}

	public Categories listCategories(CategoriesEndPoint endPoint) throws APIException {
		return (Categories) this.get(endPoint, Categories.class);
	}

	public Cities listCities(CitiesEndPoint endPoint) throws APIException {
		return (Cities) this.get(endPoint, Cities.class);
	}

	public CommentList getCommentsByGroupEvent(String groupUrlName, String eventId) throws APIException {
		GroupEventCommentsListEndPoint endPoint = new GroupEventCommentsListEndPoint(groupUrlName, eventId);
		return (CommentList) this.get(endPoint, CommentList.class);
	}

	public Event getEvent(String groupUrlName, String eventId) throws APIException {
		GroupEventEndPoint endPoint = new GroupEventEndPoint(groupUrlName, eventId);
		return (Event) this.get(endPoint, Event.class);
	}

	public EventList getEventsByGroup(String groupUrlName) throws APIException {
		GroupEventsEndPoint endPoint = new GroupEventsEndPoint(groupUrlName);
		return (EventList) this.get(endPoint, EventList.class);
	}

	public Ratings getEventRatings(String eventId, String memberId) throws APIException {
		EventRatingsEndPoint endPoint = new EventRatingsEndPoint(eventId, memberId);
		return (Ratings) this.get(endPoint, Ratings.class);
	}

	public GroupList getSimilarGroups(String groupUrlName) throws APIException {
		SimilarGroupsEndPoint endPoint = new SimilarGroupsEndPoint(groupUrlName);
		return (GroupList) this.get(endPoint, GroupList.class);
	}

	public PhotoList getGroupEventPhotos(String groupUrlName, String eventId) throws APIException {
		GroupEventPhotosEndPoint endPoint = new GroupEventPhotosEndPoint(groupUrlName, eventId);
		return (PhotoList) this.get(endPoint, PhotoList.class);
	}

	public MemberList getGroupMembers(String groupUrlName) throws APIException {
		GroupMembersEndPoint endPoint = new GroupMembersEndPoint(groupUrlName);
		return (MemberList) this.get(endPoint, MemberList.class);
	}

	public MemberList getGroupMembers(String groupUrlName, String role) throws APIException {
		GroupMembersEndPoint endPoint = new GroupMembersEndPoint(groupUrlName, role);
		return (MemberList) this.get(endPoint, MemberList.class);
	}

	public MemberList getGroupOrganizers(String groupUrlName) throws APIException {
		GroupMembersEndPoint endPoint = new GroupMembersEndPoint(groupUrlName, "leads");
		return (MemberList) this.get(endPoint, MemberList.class);
	}

	public RSVPList getGroupEventRSVPs(String groupUrlName, String eventId) throws APIException {
		GroupEventRSVPEndPoint endPoint = new GroupEventRSVPEndPoint(groupUrlName, eventId);
		return (RSVPList) this.get(endPoint, RSVPList.class);
	}

	public Groups searchGroups(GroupsEndPoint endPoint) throws APIException {
		return (Groups) this.get(endPoint, Groups.class);
	}

	public Member getMember(String memberId) throws APIException {
		MemberEndPoint endPoint = new MemberEndPoint(memberId);
		return (Member) this.get(endPoint, Member.class);
	}

	public Member getGroupMember(String groupUrlName, String memberId) throws APIException {
		GroupMemberEndPoint endPoint = new GroupMemberEndPoint(groupUrlName, memberId);
		return (Member) this.get(endPoint, Member.class);
	}

	public Object getAttendanceListByGroupEvent(String groupUrlName, String eventId) throws APIException {
		// TODO REQUIRES ADMIN PERMISSIONS. IMPLEMENT AT SOME POINT
		return null;
		// EventAttendanceListEndPoint endPoint = new
		// EventAttendanceListEndPoint(
		// groupUrlName, eventId);
		// return (Comments) this.get(endPoint, Comments.class);
	}

}
