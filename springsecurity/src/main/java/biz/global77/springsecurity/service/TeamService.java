package biz.global77.springsecurity.service;

import java.util.List;

import biz.global77.springsecurity.model.Team;

public interface TeamService {
	
	List<Team> getAllTeams();
	void saveTeam(Team team);
	Team getTeamById(long id);
	void deleteTeamById(long id);

}
