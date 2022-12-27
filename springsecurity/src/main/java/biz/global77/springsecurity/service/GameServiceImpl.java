package biz.global77.springsecurity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import biz.global77.springsecurity.model.Game;
import biz.global77.springsecurity.repository.GameRepository;

public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Override
	public List<Game> getAllGames() {
		return gameRepository.findAll();
	}

}
