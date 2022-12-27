package biz.global77.springsecurity.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import biz.global77.springsecurity.model.Team;
import biz.global77.springsecurity.repository.TeamRepository;

public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	@Override
	public void saveTeam(Team team) {
		this.teamRepository.save(team);
	}

	@Override
	public Team getTeamById(long id) {
		Optional<Team> optional = teamRepository.findById(id);
		Team team = null;
		if (optional.isPresent()) {
			team = optional.get();
		} else {
			throw new RuntimeException(" Team not found for id :: " + id);
		}
		return team;
	}

	@Override
	public void deleteTeamById(long id) {
		this.teamRepository.deleteById(id);
	}

}
