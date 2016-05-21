package es.prodevelop.pui.http.client;

import org.junit.Assert;
import org.junit.Test;

import es.prodevelop.pui.http.client.models.DefaultAPIResponse;
import es.prodevelop.pui.http.client.poiproxy.DefaultPOIProxyController;
import es.prodevelop.pui.http.client.poiproxy.POIProxyBrowseEndPoint;
import es.prodevelop.pui.http.client.poiproxy.POIProxyController;
import es.prodevelop.pui.http.client.poiproxy.POIProxyResponse;

public class POIProxyControllerTest {

	@Test
	public void getEndPointTest() {
		Configuration configuration = new Configuration("http://app.prodevelop.es/poiproxy", "");

		POIProxyController controller = new POIProxyController(configuration);
		try {
			POIProxyResponse response = controller.get(new POIProxyBrowseEndPoint());
			Assert.assertTrue(response.getType().equals("FeatureCollection"));
		} catch (APIException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false == true);
			// lock.notify();
		} finally {

		}
	}
}
