/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface APIParamAnnotation {

	/**
	 * The name of the column in the database
	 */
	String name();

	/**
	 * If the param is templated in the {@link APIEndPoint#getEndPointUri()}
	 */
	boolean isTemplateParam() default false;

	/**
	 * If the param has to be appended to the
	 * {@link APIEndPoint#getEndPointUri()}
	 */
	boolean isQueryParam() default true;

	/**
	 * If the param has to be used in a post query
	 */
	boolean isPostParam() default false;

	/**
	 * If the param value should be optional
	 */
	boolean optional() default false;
}
