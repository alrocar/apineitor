/**
 * @aromeu
 */
package com.apineitor.request;

import com.apineitor.http.APIException;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIParamAnnotation;

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