package com.demo.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.demo.model.Player;

public class HQLMain {

	public static void main(String[] args) {
		/*
		 * HQL - stands for Hibernate Query Language which is not DB dependent,
		 * this will work on any sort of RDBMS DB's.
		 * Like a regular SQL even HQL provides
		 * --Aggregate Functions
		 * --Joins, Subqueries
		 * 
		 * It is independent of PK you can use HQL to get,update,delete the 
		 * data with any coloumn which is not PK as well.
		 * Do remember you cannot perform INSERT using HQL, INSERT should be still done using only
		 * Session object
		 */
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query=session.createQuery("from com.demo.model.Player");
		System.out.println("Printing all Players");
		List<Player> playersList=query.list();
		for(Player p:playersList) {
			System.out.println(p);
		}
		
		String teamName="Windies";
		 query=session.createQuery("from com.demo.model.Player where teamName=:teamName");
		query.setString("teamName", teamName);
		
		System.out.println("Printing players from Team "+teamName);
		playersList=query.list();
		for(Player p:playersList) {
			System.out.println(p);
		}
		
		int age=40;
		teamName="India";
		 query=session.createQuery("from com.demo.model.Player where teamName=:teamName and age>:age");
			query.setString("teamName", teamName);
			query.setInteger("age", age);
		
			playersList=query.list();
			System.out.println("Printing players from Team "+teamName+" who are aged above "+age);
			for(Player p:playersList) {
				System.out.println(p);
			}
			
			//HCQL - Hibernate Criteria Query Language
			Criteria criteria=session.createCriteria(Player.class);
			criteria.add(Restrictions.gt("age", 36));
			List<Player> pList=criteria.list();
			
			System.out.println("Printing ALL players using HCQL");
			for(Player p:pList) {
				System.out.println(p);
			}
			
		transaction.commit();
		session.close();
		factory.close();
	}
//try update and delete with same above apart from PK
	//try with Search/select with any other criteria as such.
}
