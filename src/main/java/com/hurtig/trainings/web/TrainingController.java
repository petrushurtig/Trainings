package com.hurtig.trainings.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hurtig.trainings.domain.TrainingRepository;

@Controller
public class TrainingController {

	@Autowired
	private TrainingRepository repository;
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/trainings")
	public String trainings(Model model) {
		model.addAttribute("trainings", repository.findAll());
		return "trainings";
		
	}
}
