package com.wipro.dietManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.dietManagement.Pojo.BatchDetails;

public interface BatchDetailsRepository extends JpaRepository<BatchDetails, String> {
	public BatchDetails findByBatchid(String id);
}
