package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	private Integer playerId;
	private Integer teamId;
	private Integer gameId;
	private String fullname;
	public Player() {
		super();
	}
	public Player(Integer teamId, Integer gameId, String fullname) {
		super();
		this.teamId = teamId;
		this.gameId = gameId;
		this.fullname = fullname;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
}
