/**
 * 
 */
package com.vd.pollingapp.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author Vivek Deshmukh
 *
 */
public class PollLength {

	@NotNull
    @Max(7)
    private Integer days;

    @NotNull
    @Max(23)
    private Integer hours;

	/**
	 * @return the days
	 */
	public Integer getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}

	/**
	 * @return the hours
	 */
	public Integer getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(Integer hours) {
		this.hours = hours;
	}
    
}
