/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.request;

import es.prodevelop.pui.http.client.APIException;
import es.prodevelop.pui.http.client.models.APIEndPoint;
import es.prodevelop.pui.http.client.models.APIParamAnnotation;

public class TemplateParamHashMap extends AbstractParamHashMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2630307893247871423L;

	public TemplateParamHashMap(APIEndPoint endPoint) throws APIException {
		super(endPoint);
	}

	public boolean isValid(APIParamAnnotation apiParam) {
		return apiParam.isTemplateParam();
	}
}