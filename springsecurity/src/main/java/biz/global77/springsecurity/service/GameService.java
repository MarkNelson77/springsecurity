package biz.global77.springsecurity.service;

import java.util.List;
import biz.global77.springsecurity.model.Game;

public interface GameService {
	List<Game> getAllGames();
	void saveGame(Game game);
}
