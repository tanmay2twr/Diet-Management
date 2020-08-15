package com.wipro.dietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterChallenger {
	private String fullName;
	private int age;
	private String gender;
	private long mobileNumber;
	@Id
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private int height;
	private int weight;
	private int bmi;
	private String batch;
	private String reason;
	private String existing_medical;
	private String existing_dietary;
	private String dietary_custom;
	private String pregnant_status;
	private String referral_code;

	public RegisterChallenger() {
	}

	public RegisterChallenger(String fullName, int age, String gender, long mobileNumber, String email, String address,
			String city, String state, String country, String pincode, int height, int weight, int bMI, String batch,
			String reason, String existing_medical, String existing_dietary, String dietary_custom,
			String pregnant_status, String referral_code) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.height = height;
		this.weight = weight;
		bmi = bMI;
		this.batch = batch;
		this.reason = reason;
		this.existing_medical = existing_medical;
		this.existing_dietary = existing_dietary;
		this.dietary_custom = dietary_custom;
		this.pregnant_status = pregnant_status;
		this.referral_code = referral_code;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBMI() {
		return bmi;
	}

	public void setBMI(int bMI) {
		bmi = bMI;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getExisting_medical() {
		return existing_medical;
	}

	public void setExisting_medical(String existing_medical) {
		this.existing_medical = existing_medical;
	}

	public String getExisting_dietary() {
		return existing_dietary;
	}

	public void setExisting_dietary(String existing_dietary) {
		this.existing_dietary = existing_dietary;
	}

	public String getDietary_custom() {
		return dietary_custom;
	}

	public void setDietary_custom(String dietary_custom) {
		this.dietary_custom = dietary_custom;
	}

	public String getPregnant_status() {
		return pregnant_status;
	}

	public void setPregnant_status(String pregnant_status) {
		this.pregnant_status = pregnant_status;
	}

	public String getReferral_code() {
		return referral_code;
	}

	public void setReferral_code(String referral_code) {
		this.referral_code = referral_code;
	}

}
