/**
 * 
 */
package com.vd.pollingapp.vo;

/**
 * @author Vivek Deshmukh
 *
 */
public class UserIdentityAvailability {

	private Boolean available;

    public UserIdentityAvailability(Boolean available) {
        this.available = available;
    }

	/**
	 * @return the available
	 */
	public Boolean getAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(Boolean available) {
		this.available = available;
	}
    
}
