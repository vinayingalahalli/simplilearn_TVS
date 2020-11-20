package com.demo.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.otm.model.Answer;
import com.demo.otm.model.Question;

public class OnetoManyMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Question q1=new Question();
//		q1.setQuery("Who invented C?");
//		
//		Answer a1=new Answer("James Gosling", "Suraj1");
//		a1.setQuestion(q1);
//		Answer a2=new Answer("Ravindra Jadeja", "Uma1");
//		a2.setQuestion(q1);
//		Answer a3=new Answer("Dennies Ritchie", "Kumari1");
//		a3.setQuestion(q1);
//		Answer a4=new Answer("Dennies Ritchie", "Kevin1");
//		a4.setQuestion(q1);
//		Answer a5=new Answer("Bijarane Stroustroup", "Raghuraman1");
//		a5.setQuestion(q1);
//		List<Answer>answers=new ArrayList<>();
//		answers.add(a1);
//		answers.add(a2);
//		answers.add(a3);
//		answers.add(a4);
//		answers.add(a5);
//		q1.setAnswersList(answers);
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(a4);
//		session.save(a5);
//		session.save(q1);
		
		Criteria c=session.createCriteria(Question.class);
		List<Question> li=c.list();
		for(Question q:li) {
			System.out.println(q.getQuery());
			List<Answer> liA=q.getAnswersList();
			for(Answer a:liA) {
				System.out.println(a);
			}
		}
		transaction.commit();
		session.close();
		factory.close();

	}

}
