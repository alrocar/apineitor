package com.apineitor.tests.poiproxy;

import com.apineitor.controllers.APIController;
import com.apineitor.http.Configuration;
import com.apineitor.models.DefaultAPIResponse;

@SuppressWarnings("rawtypes")
public class DefaultPOIProxyController extends APIController<POIProxyBrowseEndPoint, DefaultAPIResponse> {

	public DefaultPOIProxyController(Configuration _configuration) {
		super(_configuration, DefaultAPIResponse.class);
	}
}
