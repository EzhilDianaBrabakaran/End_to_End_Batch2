package com.spring.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Trainings {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@Column(name = "user_id")
private long userId;

@Column(name = "mentor_id")
private long mentorId;

@Column(name = "skill_id")
private long skillId;

@Column(name = "status")
private int status;

@Column(name = "progress")
private String progress;

@Column(name = "rating")
private String rating;

@Column(name = "start_date")
private String startDate;

@Column(name = "end_date")
private String endDate;

@Column(name = "start_time")
private String startTime;

@Column(name = "end_time")
private String endTime;

@Column(name = "amount_received")
private double amountReceived;

public Trainings(long userId, long mentorId, long skillId, int status, String progress, String rating,
		String startDate, String endDate, String startTime, String endTime, double amountReceived) {
	super();
	this.userId = userId;
	this.mentorId = mentorId;
	this.skillId = skillId;
	this.status = status;
	this.progress = progress;
	this.rating = rating;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startTime = startTime;
	this.endTime = endTime;
	this.amountReceived = amountReceived;
}
public Trainings() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public long getMentorId() {
	return mentorId;
}
public void setMentorId(long mentorId) {
	this.mentorId = mentorId;
}
public long getSkillId() {
	return skillId;
}
public void setSkillId(long skillId) {
	this.skillId = skillId;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getProgress() {
	return progress;
}
public void setProgress(String progress) {
	this.progress = progress;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public double getAmountReceived() {
	return amountReceived;
}
public void setAmountReceived(double amountReceived) {
	this.amountReceived = amountReceived;
}


}
