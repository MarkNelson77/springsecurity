package biz.global77.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import biz.global77.springsecurity.model.Record;
import biz.global77.springsecurity.service.RecordService;

@Controller
public class RecordController {
	
	@Autowired
	private RecordService recordService;

	//Display List of Records
	@GetMapping("/records")
	public String viewRecords(Model model) {
		model.addAttribute("listOfRecords", recordService.getAllRecords());
		return "forAuthenticated/records";
	}
	
	//Adding New Record
	@GetMapping("/showNewRecordForm")
	public String showNewRecordForm(Model model) {
		//Create Model Attribute to bind form data
		Record record = new Record();
		model.addAttribute("record", record);
		return "forAuthenticated/new_record";
	}
	
	@PostMapping("/saveRecord")
	public String saveRecord(@ModelAttribute("record") Record record) {
		// Save record to database
		recordService.saveRecord(record);
		return "redirect:/records";
	}
	
	@GetMapping("/showFormForEditRecord/{id}")
	public String showFormForEditRecord(@PathVariable ( value = "id") long id, Model model) {
		
		// Get record from the service
		Record record = recordService.getRecordById(id);
		
		// Set record as a model attribute to pre-populate the form
		model.addAttribute("record", record);
		return "forAuthenticated/edit_record";
	}
	
	@GetMapping("/deleteRecord/{id}")
	public String deleteRecord(@PathVariable (value = "id") long id) {
		
		// Call delete record method 
		this.recordService.deleteRecordById(id);
		return "redirect:/records";
	}


}
