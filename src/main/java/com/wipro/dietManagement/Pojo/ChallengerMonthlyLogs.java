package com.wipro.dietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChallengerMonthlyLogs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String fullName;
	private String batchName;
	private String batchGroup;
	private String month;
	private float biceps;
	private float chest;
	private float foreArms;
	private float height;
	private float shoulders;
	private float thighs;
	private float waist;
	private float weight;

	public ChallengerMonthlyLogs(int id, String username, String fullName, String batchName, String batchGroup,
			String month, float biceps, float chest, float foreArms, float height, float shoulders, float thighs,
			float waist, float weight) {
		super();
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.batchName = batchName;
		this.batchGroup = batchGroup;
		this.month = month;
		this.biceps = biceps;
		this.chest = chest;
		this.foreArms = foreArms;
		this.height = height;
		this.shoulders = shoulders;
		this.thighs = thighs;
		this.waist = waist;
		this.weight = weight;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ChallengerMonthlyLogs() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchGroup() {
		return batchGroup;
	}

	public void setBatchGroup(String batchGroup) {
		this.batchGroup = batchGroup;
	}

	public float getBiceps() {
		return biceps;
	}

	public void setBiceps(float biceps) {
		this.biceps = biceps;
	}

	public float getChest() {
		return chest;
	}

	public void setChest(float chest) {
		this.chest = chest;
	}

	public float getForeArms() {
		return foreArms;
	}

	public void setForeArms(float foreArms) {
		this.foreArms = foreArms;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getShoulders() {
		return shoulders;
	}

	public void setShoulders(float shoulders) {
		this.shoulders = shoulders;
	}

	public float getThighs() {
		return thighs;
	}

	public void setThighs(float thighs) {
		this.thighs = thighs;
	}

	public float getWaist() {
		return waist;
	}

	public void setWaist(float waist) {
		this.waist = waist;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
