package com.wipro.dietManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wipro.dietManagement.Pojo.BatchDetails;
import com.wipro.dietManagement.Pojo.ChallengerMonthlyLogs;
import com.wipro.dietManagement.Pojo.DailyLog;
import com.wipro.dietManagement.Pojo.DietPlanFile;
import com.wipro.dietManagement.Pojo.RegisterChallenger;
import com.wipro.dietManagement.Pojo.Users;
import com.wipro.dietManagement.repository.BatchDetailsRepository;
import com.wipro.dietManagement.repository.DailyLogRepository;
import com.wipro.dietManagement.repository.DietPlanRepository;
import com.wipro.dietManagement.repository.MonthlyLogsRepository;
import com.wipro.dietManagement.repository.RegisterRepository;
import com.wipro.dietManagement.repository.UserRepository;

@Service
public class AdminService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RegisterRepository regisRepo;
	@Autowired
	private Users user;
	@Autowired
	public JavaMailSender javaMailSender;
	@Autowired
	public MonthlyLogsRepository monthlyLogsRepo;
	@Autowired
	public DailyLogRepository dailyLogRepo;
	@Autowired
	public BatchDetailsRepository batchDetailsRepo;
	@Autowired
	public DietPlanRepository dietPlanRepo;

	public List<RegisterChallenger> viewRequests() {
		return regisRepo.findByBatch(null);
	}

	public void deleteRequest(String email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Sorry");
		message.setText(
				"Hi, We are sorry to inform you that your request for registration has been declined by the administrator");
		javaMailSender.send(message);
		regisRepo.deleteById(email);
	}

	public boolean acceptRequest(String email) {
		RegisterChallenger challenger = regisRepo.findById(email).get();
		if (challenger.getBMI() < 25) {
			challenger.setBatch("BelowBMI25");
			regisRepo.save(challenger);
		} else {
			challenger.setBatch("AboveBMI25");
			regisRepo.save(challenger);
		}
		user.setName(challenger.getFullName());
		user.setBatch_group(challenger.getCity());
		user.setBatch_name(challenger.getBatch());
		user.setBatch_status("Ongoing");
		user.setMobile(challenger.getMobileNumber());
		user.setUsername(challenger.getEmail());
		user.setPassword("wipro@123");
		user.setRole("challenger");
		userRepo.save(user);
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Congratulations");
		message.setText("Hi " + user.getName()
				+ " ,Your request for registration has been successfully accepted. Please Login with default ID as: "
				+ email + " and password as: " + user.getPassword());
		javaMailSender.send(message);
		return true;
	}

	public List<ChallengerMonthlyLogs> viewMonthlyLogs(String email) {
		return monthlyLogsRepo.findByUsername(email);
	}

	public List<Users> returnAllChallengers() {
		return userRepo.findByRole("challenger");
	}

	public List<DailyLog> viewDailyLog(String email) {
		return dailyLogRepo.findByUsername(email);
	}

	public void uploadFile(DietPlanFile dietPlanFile) {
		dietPlanRepo.save(dietPlanFile);
	}

	public List<BatchDetails> getBatches() {
		return batchDetailsRepo.findAll();
	}

	public List<Users> getMentors() {
		return userRepo.findByRoleAndBatchname("mentor", "NA");
	}

	public void assignMentor(String name, String batchId) {
		Users user = userRepo.findByName(name);
		BatchDetails batch=batchDetailsRepo.findByBatchid(batchId);
		System.out.println(user);
		System.out.println(batch);
		user.setBatch_name(batch.getBatchCategory());
		user.setBatch_group(batch.getBatchGroup());
		user.setBatch_month(batch.getBatchTenure());
		user.setBatch_status(batch.getBatchStatus());
		userRepo.save(user);
	}

}
