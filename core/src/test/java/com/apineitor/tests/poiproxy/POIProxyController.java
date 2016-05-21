package com.apineitor.tests.poiproxy;

import com.apineitor.controllers.APIController;
import com.apineitor.http.Configuration;

public class POIProxyController extends
		APIController<POIProxyBrowseEndPoint, POIProxyResponse> {

	public POIProxyController(Configuration _configuration) {
		super(_configuration, POIProxyResponse.class);
	}
}
