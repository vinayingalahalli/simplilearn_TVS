package com.demo.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Trainee;

public class TraineeMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Trainee t1=new Trainee("Sudha", 1234567899L, "Coimbatore", new Date());
		Trainee t2=new Trainee("Mathumathi", 2234567899L, "Coimbatore", new Date());
		Trainee t3=new Trainee("Irfan", 3234567899L, "Chennai", new Date());
		Trainee t4=new Trainee("Kokila", 4234567899L, "Chennai", new Date());
		Trainee t5=new Trainee("Nagammal", 5234567899L, "Erode", new Date());
		Trainee t6=new Trainee("Raghuraman", 6234567899L, "Salem", new Date());
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(t5);
		session.save(t6);
		transaction.commit();
		session.close();
		factory.close();

	}

}
