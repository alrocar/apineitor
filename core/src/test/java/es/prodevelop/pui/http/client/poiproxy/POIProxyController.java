package es.prodevelop.pui.http.client.poiproxy;

import es.prodevelop.pui.http.client.Configuration;
import es.prodevelop.pui.http.client.controllers.APIController;

public class POIProxyController extends
		APIController<POIProxyBrowseEndPoint, POIProxyResponse> {

	public POIProxyController(Configuration _configuration) {
		super(_configuration, POIProxyResponse.class);
	}
}
