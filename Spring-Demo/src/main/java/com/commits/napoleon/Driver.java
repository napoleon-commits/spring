package com.commits.napoleon;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Player p = new Player();
//		p.setPid(1);
//		p.setPname("Bobby Fischer");
//		p.setPopening("King's pawn");
//		
//		System.out.println(p);
		
//		I.o.c
//		1. Add Jar Files for Spring Core
//		2. Configure Java Object in an XML File
//		3. Use Spring IoC Container, BeanFactory or ApplicationContext, to get the object constructed by container
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("playerbean.xml");
		Player p1 = (Player) ac.getBean("player1");
//		Player p2 = ac.getBean("player2", Player.class);
		
		System.out.println(p1);
//		System.out.println(p2);
		
//		BeanFactory
		
//		Resource r = new ClassPathResource("playerbean.xml");
//		BeanFactory bf = new XmlBeanFactory(r);
//		
//		Player pl1 = bf.getBean("player1", Player.class);
//		Player pl2 = (Player) bf.getBean("player2");
//		
//		System.out.println(pl1);
//		System.out.println(pl2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) ac;
		cxt.close();
	}

}
