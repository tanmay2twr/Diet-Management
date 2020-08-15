package com.wipro.dietManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.dietManagement.Pojo.DietPlanFile;

public interface DietPlanRepository extends JpaRepository<DietPlanFile, Number> {
	public List<DietPlanFile> findByBatchnameAndBatchgroup(String batchname, String batchgroup);
}
