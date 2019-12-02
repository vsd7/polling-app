/**
 * 
 */
package com.vd.pollingapp.vo;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Vivek Deshmukh
 *
 */
public class PollRequest {

	@NotBlank
    @Size(max = 140)
    private String question;

    @NotNull
    @Size(min = 2, max = 6)
    @Valid
    private List<ChoiceRequest> choices;

    @NotNull
    @Valid
    private PollLength pollLength;

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the choices
	 */
	public List<ChoiceRequest> getChoices() {
		return choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(List<ChoiceRequest> choices) {
		this.choices = choices;
	}

	/**
	 * @return the pollLength
	 */
	public PollLength getPollLength() {
		return pollLength;
	}

	/**
	 * @param pollLength the pollLength to set
	 */
	public void setPollLength(PollLength pollLength) {
		this.pollLength = pollLength;
	}
    
    
}
