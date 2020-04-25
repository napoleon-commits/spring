package com.commits.napoleon;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/players")
	@ResponseBody
	public List<Players> getPlayers() {
		return repo.findAll();
	}
	
	@RequestMapping("/players/{pid}")
	@ResponseBody
	public Optional<Players> getPlayers2(@PathVariable("pid") int pid) {
		return repo.findById(pid);
	}
	
	@PostMapping("/players")
	public Players getPlayers3(@RequestBody Players p) {
		repo.save(p);
		return p;
	}
	
	@DeleteMapping("/players/{pid}")
	public Players getPlayers4(@PathVariable("pid") int pid) {
		Players p = repo.getOne(pid);
		repo.delete(p);
		return p;
	}
	
	@PutMapping(path="/players", consumes= {"application/json"})
	public Players getPlayers5(@RequestBody Players p) {
		repo.save(p);
		return p;
	}
}
