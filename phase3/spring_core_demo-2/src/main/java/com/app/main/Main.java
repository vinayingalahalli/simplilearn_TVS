package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Player;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Player p1=(Player) context.getBean("p1");
		Player p2=(Player) context.getBean("p2");
		Player p3=(Player) context.getBean("p3");
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		System.out.println("p3 = "+p3);

	}

}
