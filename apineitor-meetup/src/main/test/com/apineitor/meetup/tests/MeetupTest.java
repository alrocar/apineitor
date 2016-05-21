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
package com.apineitor.meetup.tests;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.apineitor.http.APIException;
import com.apineitor.meetup.Meetup;
import com.apineitor.meetup.MeetupConfiguration;
import com.apineitor.meetup.endpoints.CategoriesEndPoint;
import com.apineitor.meetup.endpoints.CitiesEndPoint;
import com.apineitor.meetup.endpoints.GroupsEndPoint;
import com.apineitor.meetup.models.Categories;
import com.apineitor.meetup.models.Cities;
import com.apineitor.meetup.models.CommentList;
import com.apineitor.meetup.models.Event;
import com.apineitor.meetup.models.EventList;
import com.apineitor.meetup.models.GroupList;
import com.apineitor.meetup.models.Groups;
import com.apineitor.meetup.models.Member;
import com.apineitor.meetup.models.MemberList;
import com.apineitor.meetup.models.PhotoList;
import com.apineitor.meetup.models.RSVPList;
import com.apineitor.meetup.models.Ratings;

public class MeetupTest {

	// FIXME add your key here
	private final String MEETUP_KEY = null;

	private MeetupConfiguration configuration = new MeetupConfiguration(MEETUP_KEY);
	private Meetup meetup;
	private String lon = "-0.36";
	private String lat = "39.47";

	@Before
	public void setup() {
		meetup = new Meetup(configuration);
	}

	@Test
	public void listCategoriesTest() {
		if (!runTests()) {
			return;
		}
		try {
			CategoriesEndPoint endPoint = new CategoriesEndPoint();
			Categories response = meetup.listCategories(endPoint);
			Assert.assertTrue(response.getResults().size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void listCitiesTest() {
		if (!runTests()) {
			return;
		}
		try {
			CitiesEndPoint endPoint = new CitiesEndPoint();
			endPoint.setLon(lon);
			endPoint.setLat(lat);
			Cities response = meetup.listCities(endPoint);
			Assert.assertTrue(response.getResults().size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void listCommentsTest() {
		if (!runTests()) {
			return;
		}
		try {
			CommentList response = meetup.getCommentsByGroupEvent("Health-2-0-Valencia", "230223184");
			Assert.assertTrue(response.get(0).getComment() != null);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getEventTest() {
		if (!runTests()) {
			return;
		}
		try {
			Event response = meetup.getEvent("Health-2-0-Valencia", "230223184");
			Assert.assertTrue(response.getId().equals("230223184"));
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getEventsByGroupTest() {
		if (!runTests()) {
			return;
		}
		try {
			EventList response = meetup.getEventsByGroup("Health-2-0-Valencia");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getEventRatingsTest() {
		if (!runTests()) {
			return;
		}
		try {
			Ratings response = meetup.getEventRatings("230223184", null);
			Assert.assertTrue(response.getRatings().size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getSimilarGroupsTest() {
		if (!runTests()) {
			return;
		}
		try {
			GroupList response = meetup.getSimilarGroups("Health-2-0-Valencia");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getGroupEventPhotosTest() {
		if (!runTests()) {
			return;
		}
		try {
			PhotoList response = meetup.getGroupEventPhotos("ny-tech", "3632347");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getGroupMembersTest() {
		if (!runTests()) {
			return;
		}
		try {
			MemberList response = meetup.getGroupMembers("ny-tech");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getGroupOrganizersTest() {
		if (!runTests()) {
			return;
		}
		try {
			MemberList response = meetup.getGroupOrganizers("ny-tech");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getGroupEventRSVPsTest() {
		if (!runTests()) {
			return;
		}
		try {
			RSVPList response = meetup.getGroupEventRSVPs("ny-tech", "3632347");
			Assert.assertTrue(response.size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void searchGroupsTest() {
		if (!runTests()) {
			return;
		}
		try {
			GroupsEndPoint endPoint = new GroupsEndPoint();
			endPoint.setLon(lon);
			endPoint.setLat(lat);
			Groups response = meetup.searchGroups(endPoint);
			Assert.assertTrue(response.getResults().size() > 0);
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getMemberTest() {
		if (!runTests()) {
			return;
		}
		try {
			Member response = meetup.getMember("60484662");
			Assert.assertTrue(response.getId().equals(new Long(60484662)));
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getGroupMemberTest() {
		if (!runTests()) {
			return;
		}
		try {
			Member response = meetup.getGroupMember("Health-2-0-Valencia", "60484662");
			Assert.assertTrue(response.getId().equals(new Long(60484662)));
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	private boolean runTests() {
		return StringUtils.isNotBlank(MEETUP_KEY);
	}

}
