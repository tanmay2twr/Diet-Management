package com.wipro.dietManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dietManagement.Pojo.ChallengerMonthlyLogs;
import com.wipro.dietManagement.Pojo.DailyLog;
import com.wipro.dietManagement.Pojo.Message;
import com.wipro.dietManagement.Pojo.Users;
import com.wipro.dietManagement.repository.DailyLogRepository;
import com.wipro.dietManagement.Pojo.DietPlanFile;
import com.wipro.dietManagement.repository.DietPlanRepository;
import com.wipro.dietManagement.repository.MessageRepository;
import com.wipro.dietManagement.repository.MonthlyLogsRepository;
import com.wipro.dietManagement.repository.UserRepository;

@Service
public class ChallengerService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private MonthlyLogsRepository monthlyLogsRepo;
	@Autowired
	private MessageRepository messageRepo;
	@Autowired
	private DailyLogRepository dailyLogRepo;
	@Autowired
	private DietPlanRepository dietPlanRepo;

	public ChallengerMonthlyLogs saveMonthlyLogs(ChallengerMonthlyLogs log) {
		return monthlyLogsRepo.save(log);
	}

	public Message addMessage(Message message) {
		return messageRepo.save(message);
	}

	public List<Message> viewMessage(String email) {
		Users user=userRepo.findByUsername(email);
		List<Message> message=messageRepo.findBySentTo(email);
		message.addAll(messageRepo.findByFullnameAndSentTo(user.getBatch_name(), user.getBatch_group()));
		System.out.println(message);
		return message;
	}

	public void deleteMessage(int id) {
		messageRepo.deleteById(id);
	}

	public void saveDailyLog(DailyLog log) {
		dailyLogRepo.save(log);
	}

	public Optional<DietPlanFile> getFile(int id) {
		return dietPlanRepo.findById(id);
	}

	public List<DietPlanFile> getFiles(String email) {
		Users user = userRepo.findByUsername(email);
		return dietPlanRepo.findByBatchnameAndBatchgroup(user.getBatch_name(), user.getBatch_group());
	}
}
