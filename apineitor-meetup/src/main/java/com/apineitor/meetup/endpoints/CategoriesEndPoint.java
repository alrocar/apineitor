package com.apineitor.meetup.endpoints;

import com.apineitor.meetup.params.DefaultParams;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIEndPointAnnotation;
import com.apineitor.request.HttpMethod;

@APIEndPointAnnotation(method = HttpMethod.GET, url = "/2/categories/")
public class CategoriesEndPoint extends DefaultParams implements APIEndPoint {

	public CategoriesEndPoint() {
		super();
	}

	public CategoriesEndPoint(String fields, String order, String page, String offset, String desc, String only,
			String omit) {
		super(fields, order, page, offset, desc, only, omit);
	}
}
