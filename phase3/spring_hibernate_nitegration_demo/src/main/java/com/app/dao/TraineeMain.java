package com.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Trainee;

public class TraineeMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_hibernate_beans.xml");
		TraineeDAO dao=(TraineeDAO) context.getBean("dao");
		
		//System.out.println(dao.createTrainee(new Trainee("Lalith Chetry", 8989123456L, "Pune", new Date())));
		System.out.println(dao.getTraineeById(2));
		
		System.out.println("\n\nPrinting all trainees");
		List<Trainee> tList=dao.getAllTrainees();
		for(Trainee t:tList) {
			System.out.println(t);
		}
	}

}
