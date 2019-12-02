/**
 * 
 */
package com.vd.pollingapp.vo;

import javax.validation.constraints.NotNull;

/**
 * @author Vivek Deshmukh
 *
 */
public class VoteRequest {

	@NotNull
    private Long choiceId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}
