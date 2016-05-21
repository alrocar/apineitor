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
