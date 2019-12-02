/**
 * 
 */
package com.vd.pollingapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Vivek Deshmukh
 *
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class PollingAppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1949217245870924850L;

	public PollingAppException(String message) {
        super(message);
    }

    public PollingAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
