package com.rms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rms.demo.entity.Robot;
import com.rms.demo.service.RobotService;

@Controller
public class RobotController {

	public RobotService robotService;


	// Constructor dependency based injection
	public RobotController(RobotService robotService) {
		super();
		this.robotService = robotService;
	}

	// Handler method to handle robots list and return mode and view
	@GetMapping("/robots")
	public String robotsList(Model model) {

		// Return a view
		// Spring boot will automatically configure view server bean for thymeleaf
		model.addAttribute("robots", robotService.getRobotList());
		return "robots";
	}

	// Handler method to create a new robot instance
	@GetMapping("/robots/new")
	public String createNewRobotsForm(Model model) {
		Robot robot = new Robot();
		model.addAttribute("robot", robot);
		return "add_robot";
	}
	
	// Handler method to add new robot information
	@PostMapping("/robots")
	public String addRobotInformation(@ModelAttribute("robot") Robot robot) {
		robotService.addRobot(robot);
		return "redirect:/robots";
	}
	
	// Handler method to edit saved robot information
	@GetMapping("/robots/edit/{id}")
	// Bind id to java information
	public String editRobotInformation(@PathVariable Long id, Model model) {
		model.addAttribute("robot", robotService.getRobotById(id));
		return "edit_robot";
	}
	
	@PostMapping("/robots/{id}")
	public String updateRobotInformation(@PathVariable Long id, @ModelAttribute("robot") Robot robot, Model model) {
		
		// Get robot from data base by ID
		Robot currentRobot = robotService.getRobotById(id);
		currentRobot.setId(id);
		currentRobot.setRobotName(robot.getRobotName());
		currentRobot.setRobotLocation(robot.getRobotLocation());
		
		// Save updated robot
		robotService.updateRobot(currentRobot);
		return "redirect:/robots";
	}
	
	@GetMapping("/robots/{id}")
	public String deleteRobotInformation(@PathVariable Long id) {
		robotService.deleteRobot(id);
		return "redirect:/robots";
	}

}
