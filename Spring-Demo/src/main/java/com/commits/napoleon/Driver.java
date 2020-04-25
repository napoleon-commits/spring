package com.commits.napoleon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p = new Player();
		p.setPid(1);
		p.setPname("Bobby Fischer");
		p.setPopening("King's pawn");
		
		System.out.println(p);
		
//		I.o.c
//		1. Add Jar Files for Spring Core
//		2. Configure Java Object in an XML File
//		3. Use Spring IoC Container, BeanFactory or ApplicationContext, to get the object constructed by container
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("playerbean.xml");
		Player p1 = (Player) ac.getBean("player1");
		Player p2 = ac.getBean("player2", Player.class);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
