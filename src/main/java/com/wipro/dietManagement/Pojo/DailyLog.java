package com.wipro.dietManagement.Pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyLog {
	@Id
	private String username;
	private String batchGroup;
	private String batchName;
	private String breakfast;
	private Date date;
	private String dinner;
	private String extraActivity;
	private String fruits;
	private String fullName;
	private String lunch;
	private String vegetables;
	private String workout;

	public DailyLog(String username, String batchGroup, String batchName, String breakfast, Date date, String dinner,
			String extraActivity, String fruits, String fullName, String lunch, String vegetables, String workout) {
		super();
		this.username = username;
		this.batchGroup = batchGroup;
		this.batchName = batchName;
		this.breakfast = breakfast;
		this.date = date;
		this.dinner = dinner;
		this.extraActivity = extraActivity;
		this.fruits = fruits;
		this.fullName = fullName;
		this.lunch = lunch;
		this.vegetables = vegetables;
		this.workout = workout;
	}

	public DailyLog() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBatchGroup() {
		return batchGroup;
	}

	public void setBatchGroup(String batchGroup) {
		this.batchGroup = batchGroup;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getExtraActivity() {
		return extraActivity;
	}

	public void setExtraActivity(String extraActivity) {
		this.extraActivity = extraActivity;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getVegetables() {
		return vegetables;
	}

	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

}
