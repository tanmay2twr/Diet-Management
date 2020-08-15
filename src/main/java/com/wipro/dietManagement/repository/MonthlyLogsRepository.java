package com.wipro.dietManagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.dietManagement.Pojo.ChallengerMonthlyLogs;

public interface MonthlyLogsRepository extends JpaRepository<ChallengerMonthlyLogs, String> {
	public List<ChallengerMonthlyLogs> findByUsername(String email);
}
