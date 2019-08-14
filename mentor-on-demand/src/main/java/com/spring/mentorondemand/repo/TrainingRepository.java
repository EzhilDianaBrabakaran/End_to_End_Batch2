package com.spring.mentorondemand.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.mentorondemand.model.Trainings;

public interface TrainingRepository extends CrudRepository<Trainings, Long>{

	List<Trainings> findByCompletedStatus(int statusValue);

	List<Trainings> findByProgressStatus(int statusValue);

	List<Trainings> createTraining(int statusValue);

	List<Trainings> proposeTraining(int statusValue);

	List<Trainings> approveTraining(int statusValue);

	List<Trainings> finalizeTraining(int statusValue);



}
