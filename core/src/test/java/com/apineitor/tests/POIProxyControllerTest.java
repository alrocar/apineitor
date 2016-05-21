package com.apineitor.tests;

import org.junit.Assert;
import org.junit.Test;

import com.apineitor.http.APICallBack;
import com.apineitor.http.APIException;
import com.apineitor.http.Configuration;
import com.apineitor.http.HttpContext;
import com.apineitor.models.DefaultAPIResponse;
import com.apineitor.tests.poiproxy.DefaultPOIProxyController;
import com.apineitor.tests.poiproxy.POIProxyBrowseEndPoint;
import com.apineitor.tests.poiproxy.POIProxyController;
import com.apineitor.tests.poiproxy.POIProxyResponse;

public class POIProxyControllerTest {

	@Test
	public void getEndPointTest() {
		Configuration configuration = new Configuration("http://app.prodevelop.es/poiproxy", "");

		POIProxyController controller = new POIProxyController(configuration);
		try {
			POIProxyResponse response = controller.get(new POIProxyBrowseEndPoint());
			Assert.assertTrue(response.getType().equals("FeatureCollection"));
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void getDefaultEndPointTest() {
		Configuration configuration = new Configuration("http://app.prodevelop.es/poiproxy", "");

		DefaultPOIProxyController controller = new DefaultPOIProxyController(configuration);
		try {
			DefaultAPIResponse response = controller.get(new POIProxyBrowseEndPoint());
			Assert.assertTrue(response.get("type").equals("FeatureCollection"));
		} catch (APIException e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
		}
	}

	@Test
	public void getAsyncEndPointTest() {
		Configuration configuration = new Configuration("http://app.prodevelop.es/poiproxy", "");

		// para que no acabe el test antes de recibir la respuesta
		// final Object lock = new Object();

		POIProxyController controller = new POIProxyController(configuration);
		try {
			controller.getAsync(new POIProxyBrowseEndPoint(), new APICallBack<POIProxyResponse>() {

				@Override
				public void onSuccess(HttpContext context, POIProxyResponse response) {
					Assert.assertTrue(response.getType().equals("FeatureCollection"));
					// lock.notify();
				}

				@Override
				public void onFailure(HttpContext context, Throwable error) {
					Assert.assertTrue(false == true);
					// lock.notify();
				}
			});

			// lock.wait();
		} catch (APIException /* | InterruptedException */ e) {
			e.printStackTrace();
			Assert.assertTrue(false == true);
			// lock.notify();
		} finally {

		}
	}
}
