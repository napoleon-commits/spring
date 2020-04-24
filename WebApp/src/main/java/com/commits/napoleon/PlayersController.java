package com.commits.napoleon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayersController {
	
	@RequestMapping("/players")
	public String players() {
		return "players";
	}
}
