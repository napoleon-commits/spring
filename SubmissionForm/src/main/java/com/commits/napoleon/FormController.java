package com.commits.napoleon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("napoleon")
	public String napoleon() {
		return "Napoleon.jsp";
	}
	
	@PostMapping("details")
	public String viewDetails(
			@RequestParam("pid") String pid,
			@RequestParam("pname") String pname,
			@RequestParam("pemail") String pemail,
			ModelMap mm
		) {
		mm.put("pid", pid);
		mm.put("pname", pname);
		mm.put("pemail", pemail);
		
		return "ViewPlayers.jsp";
	}
}
