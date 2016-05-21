package com.apineitor.meetup;

import com.apineitor.http.Configuration;

public class MeetupConfiguration extends Configuration {

	public static String uri = "https://api.meetup.com";

	public MeetupConfiguration(String oAuthAccessToken) {
		super(uri, oAuthAccessToken);
	}
}
