package com.spring.mentorondemand.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.mentorondemand.model.Trainings;
import com.spring.mentorondemand.repo.TrainingRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TrainingController {
	
	@Autowired
	TrainingRepository trainingRepository;
	
	@GetMapping("/trainings")
	public List<Trainings> getAllTrainingss() {
		System.out.println("Get all Trainingss...");

		List<Trainings> trainings = new ArrayList<>();
		trainingRepository.findAll().forEach(trainings::add);

		return trainings;
	}
	@GetMapping(value = "getCompletedTrainings/{status}")
	public List<Trainings> findByCompletedStatus(@PathVariable String status) {
		int statusValue=Integer.parseInt(status);
		List<Trainings> customers = trainingRepository.findByCompletedStatus(statusValue);
		return customers;
	}
	@GetMapping(value = "getUnderProgressTrainings/{status}")
	public List<Trainings> findByProgressStatus(@PathVariable String status) {
		int statusValue=Integer.parseInt(status);
		List<Trainings> customers = trainingRepository.findByProgressStatus(statusValue);
		return customers;
	}
	
	@PostMapping(value = "/createTraining/{status}")
	public Trainings postCustomer(@RequestBody Trainings trainings) {

		Trainings trainingsObj = trainingRepository.save(new Trainings(trainings.getUserId(),trainings.getMentorId(),trainings.getSkillId(),trainings.getStatus(),trainings.getProgress(),trainings.getRating(),trainings.getStartDate(),trainings.getEndDate(),trainings.getStartTime(),trainings.getEndTime(),trainings.getAmountReceived()));
		return trainingsObj;
	}
	
	@GetMapping(value = "proposeTraining/{status}")
	public List<Trainings> proposeTraining(@PathVariable String status) {
		int statusValue=Integer.parseInt(status);
		List<Trainings> customers = trainingRepository.proposeTraining(statusValue);
		return customers;
	}
	@GetMapping(value = "approveTraining/{status}")
	public List<Trainings> approveTraining(@PathVariable String status) {
		int statusValue=Integer.parseInt(status);
		List<Trainings> customers = trainingRepository.approveTraining(statusValue);
		return customers;
	}
	@GetMapping(value = "finalizeTraining/{status}")
	public List<Trainings> finalizeTraining(@PathVariable String status) {
		int statusValue=Integer.parseInt(status);
		List<Trainings> customers = trainingRepository.finalizeTraining(statusValue);
		return customers;
	}
}
