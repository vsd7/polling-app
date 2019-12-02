/**
 * 
 */
package com.vd.pollingapp.vo;

/**
 * @author Vivek Deshmukh
 *
 */
public class APIResponse {

	private Boolean success;
    private String message;

    public APIResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
