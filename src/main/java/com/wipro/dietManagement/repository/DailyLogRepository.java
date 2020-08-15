package com.wipro.dietManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.dietManagement.Pojo.DailyLog;

public interface DailyLogRepository extends JpaRepository<DailyLog, String> {
	public List<DailyLog> findByUsername(String email);
}
