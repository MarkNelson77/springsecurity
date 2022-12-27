package biz.global77.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import biz.global77.springsecurity.model.Game;
import biz.global77.springsecurity.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;

	//Display List of Games
	@GetMapping("/games")
	public String viewGames(Model model) {
		model.addAttribute("listOfGames", gameService.getAllGames());
		return "forAuthenticated/listOfGames";
	}
	
	//Adding New Game
	@GetMapping("/showNewGameForm")
	public String showNewGameForm(Model model) {
		//Create Model Attribute to bind form data
		Game game = new Game();
		model.addAttribute("game", game);
		return "forAuthenticated/new_game";
	}
	
	@PostMapping("/saveGame")
	public String saveGame(@ModelAttribute("game") Game game) {
		// Save game to database
		gameService.saveGame(game);
		return "redirect:/";
	}

	
}














