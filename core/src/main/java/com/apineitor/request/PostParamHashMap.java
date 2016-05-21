/**
 * @aromeu
 */
package com.apineitor.request;

import com.apineitor.http.APIException;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIParamAnnotation;

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
