package com.wipro.dietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class DietPlanFile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String batchname;
	private String batchgroup;
	@Lob
	private byte[] file;
	private String fileType;
	private String fileName;

	public DietPlanFile(int id, String batchName, String batchGroup, byte[] file, String fileType, String fileName) {
		super();
		this.id = id;
		this.batchname = batchName;
		this.batchgroup = batchGroup;
		this.file = file;
		this.fileType = fileType;
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public DietPlanFile() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatchName() {
		return batchname;
	}

	public void setBatchName(String batchName) {
		this.batchname = batchName;
	}

	public String getBatchGroup() {
		return batchgroup;
	}

	public void setBatchGroup(String batchGroup) {
		this.batchgroup = batchGroup;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
