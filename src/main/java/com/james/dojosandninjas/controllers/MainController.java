package com.james.dojosandninjas.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.models.Ninja;
import com.james.dojosandninjas.services.DojoService;
import com.james.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public MainController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
			return "dojo.jsp";
	}
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("dojo") Dojo dojo, @ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("dojo") Dojo dojo, @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/dojos/display")
	public String displayDojos(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "displaydojos.jsp";
	}
	
	@RequestMapping("/dojo/{id}")
	public String displayDojo(@ModelAttribute("ninja") Ninja ninja, @PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		List<Ninja> ninjas = ninjaService.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "onedojo.jsp";
	}
	
	

}
