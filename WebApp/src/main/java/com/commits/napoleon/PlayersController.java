package com.commits.napoleon;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayersController {
	
	@RequestMapping("/players")
	public ModelAndView players(@RequestParam("playername") String playerName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("playername", playerName);
		mv.setViewName("players");
		return mv;
	}
}
