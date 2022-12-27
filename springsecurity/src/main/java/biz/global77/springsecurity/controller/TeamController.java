package biz.global77.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import biz.global77.springsecurity.model.Team;
import biz.global77.springsecurity.service.TeamService;

@Controller
public class TeamController {
	
	@Autowired
	private TeamService teamService;

	//Display List of Teams
	@GetMapping("/teams")
	public String viewTeams(Model model) {
		model.addAttribute("listOfTeams", teamService.getAllTeams());
		return "forAuthenticated/listOfTeams";
	}
	
	//Adding New Team
	@GetMapping("/showNewTeamForm")
	public String showNewTeamForm(Model model) {
		//Create Model Attribute to bind form data
		Team team = new Team();
		model.addAttribute("team", team);
		return "forAuthenticated/new_team";
	}
	
	@PostMapping("/saveTeam")
	public String saveTeam(@ModelAttribute("team") Team team) {
		// Save team to database
		teamService.saveTeam(team);
		return "redirect:/teams";
	}
	
	@GetMapping("/showFormForEdit/{id}")
	public String showFormForEdit(@PathVariable ( value = "id") long id, Model model) {
		
		// Get team from the service
		Team team = teamService.getTeamById(id);
		
		// Set team as a model attribute to pre-populate the form
		model.addAttribute("team", team);
		return "forAuthenticated/edit_team";
	}
	
	@GetMapping("/deleteTeam/{id}")
	public String deleteTeam(@PathVariable (value = "id") long id) {
		
		// Call delete team method 
		this.teamService.deleteTeamById(id);
		return "redirect:/teams";
	}


}
