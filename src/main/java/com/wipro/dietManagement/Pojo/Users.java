package com.wipro.dietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private String username;
	private String name;
	private String batch_group;
	private String batch_month;
	private String batchname;
	private String batch_status;
	private long Mobile;
	private String password;
	private String role;

	public Users(String username, String name, String batch_group, String batch_month, String bATCH_NAME,
			String batch_status, long mobile, String password, String role) {
		super();
		this.username = username;
		this.name = name;
		this.batch_group = batch_group;
		this.batch_month = batch_month;
		batchname = bATCH_NAME;
		this.batch_status = batch_status;
		Mobile = mobile;
		this.password = password;
		this.role = role;
	}

	public Users() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long l) {
		Mobile = l;
	}

	public String getBatch_group() {
		return batch_group;
	}

	public void setBatch_group(String batch_group) {
		this.batch_group = batch_group;
	}

	public String getBatch_month() {
		return batch_month;
	}

	public void setBatch_month(String batch_month) {
		this.batch_month = batch_month;
	}

	public String getBatch_name() {
		return batchname;
	}

	public void setBatch_name(String batch_name) {
		this.batchname = batch_name;
	}

	public String getBatch_status() {
		return batch_status;
	}

	public void setBatch_status(String batch_status) {
		this.batch_status = batch_status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
