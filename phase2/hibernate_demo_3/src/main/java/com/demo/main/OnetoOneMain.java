package com.demo.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Person;

public class OnetoOneMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Passport p1=new Passport("LO27340", 8, 4243567899012L);
//		Person per1=new Person("Santosh", 5001234567L, "san@tvs.com", p1);
//		
//		session.save(p1);
//		session.save(per1);
		Query query = session.createQuery("from com.demo.model.Person");
		List<Person> pList=query.list();
		
		System.out.println("Printing persons and their ID's");
		for(Person p:pList) {
			System.out.println("Id = "+p.getId()+" Name : "+p.getName());
		}
		
		System.out.println("\n\nPrinting persons and their passport details for Name starting with K or S ");
		for(Person p:pList) {
			if(p.getName().startsWith("K")||p.getName().startsWith("S")) {
			System.out.println("Id = "+p.getId()+" Name : "+p.getName());
			System.out.println("Passport details of "+p.getName()+" is :");
			System.out.println(p.getPassport());
			}
		}
		transaction.commit();
		session.close();
		factory.close();
	}

}
