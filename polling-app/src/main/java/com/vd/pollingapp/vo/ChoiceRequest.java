/**
 * 
 */
package com.vd.pollingapp.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Vivek Deshmukh
 *
 */
public class ChoiceRequest {

	@NotBlank
    @Size(max = 40)
    private String text;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
}
