package com.wipro.dietManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.dietManagement.Pojo.RegisterChallenger;

public interface RegisterRepository extends JpaRepository<RegisterChallenger, String> {
	public List<RegisterChallenger> findByBatch(String str);
}
