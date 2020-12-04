package com.app.dao;

import java.util.List;

import com.app.model.Trainee;

public interface TraineeDAO {

	public Trainee createTrainee(Trainee trainee);
	public Trainee updateTrainee(Trainee trainee);
	public void removeTrainee(int id);
	public Trainee getTraineeById(int id);
	public List<Trainee> getAllTrainees();
}
