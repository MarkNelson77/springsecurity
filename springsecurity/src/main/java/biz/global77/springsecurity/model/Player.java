package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long playerId;
	private long teamId;
	private long gameId;
	private String fullname;
	
	@ManyToOne
	private Game game;
	
	@ManyToOne
	private Team team;
	
	public Player() {
		super();
	}
	public Player(long teamId, long gameId, String fullname) {
		super();
		this.teamId = teamId;
		this.gameId = gameId;
		this.fullname = fullname;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
}
