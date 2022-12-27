package biz.global77.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import biz.global77.springsecurity.service.GameService;

public class GameController {
	
	@Autowired
	private GameService gameService;

	//Display List of Games
	@GetMapping("/")
	public String viewGames(Model model) {
		model.addAttribute("listOfGames", gameService.getAllGames());
		return "forAuthenticated/page3";
	}
}
