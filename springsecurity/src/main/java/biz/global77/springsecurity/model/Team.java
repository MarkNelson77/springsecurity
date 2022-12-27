package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {
	
	@Id
	private Integer teamId;
	private String name;
	
	public Team() {
		super();
	}

	public Team(String name) {
		super();
		this.name = name;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
