package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {
	
	@Id
	private Integer gameId;
	private String category;
	
	public Game() {
		super();
	}

	public Game(String category) {
		super();
		this.category = category;
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
