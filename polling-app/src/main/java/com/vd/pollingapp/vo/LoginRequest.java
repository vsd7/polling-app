/**
 * 
 */
package com.vd.pollingapp.vo;

import javax.validation.constraints.NotBlank;

/**
 * @author Vivek Deshmukh
 *
 */

public class LoginRequest {

	@NotBlank
    private String usernameOrEmail;

    @NotBlank
    private String password;

	/**
	 * @return the usernameOrEmail
	 */
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}

	/**
	 * @param usernameOrEmail the usernameOrEmail to set
	 */
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
