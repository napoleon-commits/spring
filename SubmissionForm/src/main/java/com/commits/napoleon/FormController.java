package com.commits.napoleon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	PlayerRepo repo;
	
	@RequestMapping("/")
	public String details() {
		return "Napoleon.jsp";
	}
	
	@RequestMapping("/details")
	public String details(Players p) {
		repo.save(p);
		return "Napoleon.jsp";
	}
	
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewPlayers.jsp";
	}
	
	@PostMapping("getdetails")
	public ModelAndView getdetails(@RequestParam("pid") int pid) {
		ModelAndView mv = new ModelAndView("Retrieve.jsp");
		Players players = repo.findById(pid).orElse(null);
		mv.addObject(players);
		return mv;
	}
}
