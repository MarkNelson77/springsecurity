package biz.global77.springsecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.global77.springsecurity.model.Player;
import biz.global77.springsecurity.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public void savePlayer(Player player) {
		this.playerRepository.save(player);
	}

	@Override
	public Player getPlayerById(long id) {
		Optional<Player> optional = playerRepository.findById(id);
		Player player = null;
		if (optional.isPresent()) {
			player = optional.get();
		} else {
			throw new RuntimeException(" Player not found for id :: " + id);
		}
		return player;
	}

	@Override
	public void deletePlayerById(long id) {
		this.playerRepository.deleteById(id);
	}

}
