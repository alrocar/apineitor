/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.request;

import es.prodevelop.pui.http.client.APIException;
import es.prodevelop.pui.http.client.models.APIEndPoint;
import es.prodevelop.pui.http.client.models.APIParamAnnotation;

public class QueryParamHashMap extends AbstractParamHashMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7001039019250723268L;

	public QueryParamHashMap(APIEndPoint endPoint) throws APIException {
		super(endPoint);
	}

	public boolean isValid(APIParamAnnotation apiParam) {
		return apiParam.isQueryParam();
	}
}
