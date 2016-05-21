/**
 * @aromeu
 */
package com.apineitor.request;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.apache.commons.lang.ArrayUtils;

import com.apineitor.http.APIException;
import com.apineitor.models.APIEndPoint;
import com.apineitor.models.APIParamAnnotation;

public abstract class AbstractParamHashMap extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4179297935277810718L;

	public AbstractParamHashMap(APIEndPoint apiEndPoint) throws APIException {
		initialize(apiEndPoint);
	}

	public void initialize(APIEndPoint apiEndPoint) throws APIException {
		try {
			Class<?> _cls = apiEndPoint.getClass();

			Field[] fields = _cls.getDeclaredFields();

			while (_cls.getSuperclass() != null) {
				_cls = _cls.getSuperclass();
				fields = (Field[]) ArrayUtils.addAll(fields,
						_cls.getDeclaredFields());
			}

			APIParamAnnotation apiParam = null;
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					apiParam = field.getAnnotation(APIParamAnnotation.class);

					Object value = getValue(apiEndPoint, field);
					if (value == null) {
						continue;
					}

					if (apiParam == null) {
						put(field.getName(), value);
					} else {
						if (isValid(apiParam)) {
							put(apiParam.name(), value);
						}
					}
				} catch (IllegalAccessException ignore) {

				}
			}
		} catch (IllegalArgumentException e) {
			throw new APIException(e.getMessage());
		}
	}

	private Object getValue(APIEndPoint apiEndPoint, Field field)
			throws IllegalAccessException {
		return field.get(apiEndPoint);
	}

	public abstract boolean isValid(APIParamAnnotation apiParam);
}
