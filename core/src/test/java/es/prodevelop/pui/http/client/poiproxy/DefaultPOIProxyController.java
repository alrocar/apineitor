package es.prodevelop.pui.http.client.poiproxy;

import es.prodevelop.pui.http.client.Configuration;
import es.prodevelop.pui.http.client.controllers.APIController;
import es.prodevelop.pui.http.client.models.DefaultAPIResponse;

@SuppressWarnings("rawtypes")
public class DefaultPOIProxyController extends APIController<POIProxyBrowseEndPoint, DefaultAPIResponse> {

	public DefaultPOIProxyController(Configuration _configuration) {
		super(_configuration, DefaultAPIResponse.class);
	}
}
