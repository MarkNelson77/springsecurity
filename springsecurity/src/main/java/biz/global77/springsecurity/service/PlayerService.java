package biz.global77.springsecurity.service;

import java.util.List;
import biz.global77.springsecurity.model.Player;

public interface PlayerService {
	List<Player> getAllPlayers();
	void savePlayer(Player player);
	Player getPlayerById(long id);
	void deletePlayerById(long id);

}
