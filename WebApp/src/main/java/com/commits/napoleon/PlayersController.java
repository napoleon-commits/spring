package com.commits.napoleon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayersController {
	
	@RequestMapping("/players")
	public String players(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String playerName = req.getParameter("playername");
		session.setAttribute("playername", playerName);
		return "players";
	}
}
