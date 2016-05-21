/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.request;

import es.prodevelop.pui.http.client.APIException;
import es.prodevelop.pui.http.client.models.APIEndPoint;
import es.prodevelop.pui.http.client.models.APIParamAnnotation;

public class PostParamHashMap extends AbstractParamHashMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2173591443145077445L;

	public PostParamHashMap(APIEndPoint endPoint) throws APIException {
		super(endPoint);
	}

	public boolean isValid(APIParamAnnotation apiParam) {
		return apiParam.isPostParam();
	}
}
