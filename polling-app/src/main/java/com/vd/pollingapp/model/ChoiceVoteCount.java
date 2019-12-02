/**
 * 
 */
package com.vd.pollingapp.model;

/**
 * @author Vivek Deshmukh
 *
 */
public class ChoiceVoteCount {

	private Long choiceId;
    private Long voteCount;

    public ChoiceVoteCount(Long choiceId, Long voteCount) {
        this.choiceId = choiceId;
        this.voteCount = voteCount;
    }

	/**
	 * @return the choiceId
	 */
	public Long getChoiceId() {
		return choiceId;
	}

	/**
	 * @param choiceId the choiceId to set
	 */
	public void setChoiceId(Long choiceId) {
		this.choiceId = choiceId;
	}

	/**
	 * @return the voteCount
	 */
	public Long getVoteCount() {
		return voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(Long voteCount) {
		this.voteCount = voteCount;
	}
    
}
