package biz.global77.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.global77.springsecurity.model.Game;
import biz.global77.springsecurity.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Override
	public List<Game> getAllGames() {
		return gameRepository.findAll();
	}

	@Override
	public void saveGame(Game game) {
		this.gameRepository.save(game);
	}

}
