/**
 * @aromeu
 */
package es.prodevelop.pui.http.client.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import es.prodevelop.pui.http.client.request.HttpMethod;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface APIEndPointAnnotation {

	/**
	 * The url of the end point
	 */
	String url();

	/**
	 * Accept request header
	 */
	String accept() default "application/json";

	/**
	 * Accept request header
	 */
	String contentType() default "application/json";

	/**
	 * user-agent request header
	 */
	String userAgent() default "PUI";

	/**
	 * One of {@link HttpMethod}
	 */
	HttpMethod method();
}
