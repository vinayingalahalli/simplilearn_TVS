package com.app.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.dao.TraineeDAO;
import com.app.model.Trainee;

public class TraineeDAOImpl implements TraineeDAO {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public Trainee createTrainee(Trainee trainee) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainee);
		transaction.commit();
		session.close();

		return trainee;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTrainee(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Trainee getTraineeById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Trainee trainee=(Trainee) session.get(Trainee.class, id);
		transaction.commit();
		session.close();

		return trainee;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		Session session = factory.openSession();
		
		List<Trainee> traineeList=session.createQuery("from com.app.model.Trainee").list();
		session.close();

		return traineeList;
	}

}
