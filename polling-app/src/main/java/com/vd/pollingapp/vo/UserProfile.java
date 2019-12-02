/**
 * 
 */
package com.vd.pollingapp.vo;

import java.time.Instant;

/**
 * @author Vivek Deshmukh
 *
 */
public class UserProfile {

	private Long id;
    private String username;
    private String name;
    private Instant joinedAt;
    private Long pollCount;
    private Long voteCount;

    public UserProfile(Long id, String username, String name, Instant joinedAt, Long pollCount, Long voteCount) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.joinedAt = joinedAt;
        this.pollCount = pollCount;
        this.voteCount = voteCount;
    }

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the joinedAt
	 */
	public Instant getJoinedAt() {
		return joinedAt;
	}

	/**
	 * @param joinedAt the joinedAt to set
	 */
	public void setJoinedAt(Instant joinedAt) {
		this.joinedAt = joinedAt;
	}

	/**
	 * @return the pollCount
	 */
	public Long getPollCount() {
		return pollCount;
	}

	/**
	 * @param pollCount the pollCount to set
	 */
	public void setPollCount(Long pollCount) {
		this.pollCount = pollCount;
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
