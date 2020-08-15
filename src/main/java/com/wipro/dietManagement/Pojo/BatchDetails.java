package com.wipro.dietManagement.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BATCHDETAILS")
public class BatchDetails {
	@Id
	@Column(name = "BATCHID")
	private String batchid;
	@Column(name = "BATCHCATEGORY")
	private String batchCategory;
	@Column(name = "BATCHSTARTDATE")
	private String batchStartDate;
	@Column(name = "BATCHENDDATE")
	private String batchEndDate;
	@Column(name = "BATCHGROUP")
	private String batchGroup;
	@Column(name = "BATCHTENURE")
	private String batchTenure;
	@Column(name = "BATCHSTATUS")
	private String batchStatus;
	@Column(name = "BATCHSTRENGTH")
	private int batchStrenght;

	public BatchDetails(String batchId, String batchCategory, String batchStartDate, String batchEndDate,
			String batchGroup, String batchTenure, String batchStatus, int batchStrenght) {
		super();
		this.batchid = batchId;
		this.batchCategory = batchCategory;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
		this.batchGroup = batchGroup;
		this.batchTenure = batchTenure;
		this.batchStatus = batchStatus;
		this.batchStrenght = batchStrenght;
	}

	public BatchDetails() {

	}

	public String getBatchId() {
		return batchid;
	}

	public void setBatchId(String batchId) {
		this.batchid = batchId;
	}

	public String getBatchCategory() {
		return batchCategory;
	}

	public void setBatchCategory(String batchCategory) {
		this.batchCategory = batchCategory;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(String batchEndDate) {
		this.batchEndDate = batchEndDate;
	}

	public String getBatchGroup() {
		return batchGroup;
	}

	public void setBatchGroup(String batchGroup) {
		this.batchGroup = batchGroup;
	}

	public String getBatchTenure() {
		return batchTenure;
	}

	public void setBatchTenure(String batchTenure) {
		this.batchTenure = batchTenure;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public int getBatchStrenght() {
		return batchStrenght;
	}

	public void setBatchStrenght(int batchStrenght) {
		this.batchStrenght = batchStrenght;
	}

}
