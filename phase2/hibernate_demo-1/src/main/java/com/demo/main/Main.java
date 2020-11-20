package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Player;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
//		Player p1=new Player(101, "Sourav Ganguly", 46, "India", "Kolkata",1234567890L);
//		Player p2=new Player(102, "MS Dhoni", 36, "India", "Jharkhand",1234567898L);
//		Player p3=new Player(103, "Chris Gayle", 45, "Windies", "Trinidad",1234567980L);
//		Player p4=new Player(104, "Marlon Samuels", 45, "Windies", "Trinidad",1234568790L);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
		
		Player p=(Player) session.get(Player.class, 100);
		System.out.println(p);
		
		//Player p1=new Player(101, "Sourav Ganguly", 45, "India", "Kolkata",1234567890L);
		//session.update(p1);
		
		Player pl=new Player();
		pl.setId(104);
		
		session.delete(pl);
		transaction.commit();
		session.close();
		factory.close();

	}

}
