package biz.global77.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import biz.global77.springsecurity.model.Player;
import biz.global77.springsecurity.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	//Display List of Players
	@GetMapping("/players")
	public String viewPlayers(Model model) {
		model.addAttribute("listOfPlayers", playerService.getAllPlayers());
		return "forAuthenticated/players";
	}
	
	//Adding New Player
	@GetMapping("/showNewPlayerForm")
	public String showNewPlayerForm(Model model) {
		//Create Model Attribute to bind form data
		Player player = new Player();
		model.addAttribute("player", player);
		return "forAuthenticated/new_player";
	}
	
	@PostMapping("/savePlayer")
	public String savePlayer(@ModelAttribute("player") Player player) {
		// Save player to database
		playerService.savePlayer(player);
		return "redirect:/players";
	}
	
	@GetMapping("/showFormForEditPlayer/{id}")
	public String showFormForEditPlayer(@PathVariable ( value = "id") long id, Model model) {
		
		// Get player from the service
		Player player = playerService.getPlayerById(id);
		
		// Set player as a model attribute to pre-populate the form
		model.addAttribute("player", player);
		return "forAuthenticated/edit_player";
	}
	
	@GetMapping("/deletePlayer/{id}")
	public String deletePlayer(@PathVariable (value = "id") long id) {
		
		// Call delete player method 
		this.playerService.deletePlayerById(id);
		return "redirect:/players";
	}

}
