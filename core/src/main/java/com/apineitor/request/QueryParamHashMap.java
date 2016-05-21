/**
 * @aromeu
 */
package com.apineitor.request;

import com.apineitor.http.APIException;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIParamAnnotation;

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
