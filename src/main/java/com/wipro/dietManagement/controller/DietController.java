package com.wipro.dietManagement.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.dietManagement.Pojo.BatchDetails;
import com.wipro.dietManagement.Pojo.ChallengerMonthlyLogs;
import com.wipro.dietManagement.Pojo.DailyLog;
import com.wipro.dietManagement.Pojo.DietPlanFile;
import com.wipro.dietManagement.Pojo.Message;
import com.wipro.dietManagement.Pojo.RegisterChallenger;
import com.wipro.dietManagement.Pojo.Users;
import com.wipro.dietManagement.service.AdminService;
import com.wipro.dietManagement.service.ChallengerService;
import com.wipro.dietManagement.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class DietController {
	@Autowired
	private UserService userService;
	@Autowired
	private ChallengerService challengerService;
	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to DietManagement !!";
	}

	@PostMapping("/registerUser")
	public RegisterChallenger registerUser(@RequestBody RegisterChallenger user) throws Exception {
		String tempEmailID = user.getEmail();
		if (tempEmailID != null && !"".equals(tempEmailID)) {
			boolean value = userService.fetchUserByUserID(tempEmailID);
			if (value == true) {
				throw new Exception("User with " + tempEmailID + " id already exist");
			}
		}
		RegisterChallenger userObj = null;
		userObj = userService.userSave(user);
		return userObj;
	}

	@PostMapping("/login")
	public Users userLogin(@RequestBody Users user) throws Exception {
		String tempUserId = user.getUsername();
		String tempPass = user.getPassword();
		Users usertObj = null;
		if (tempUserId != null && tempPass != null) {
			usertObj = userService.fetchUserByUserIDAndPassword(tempUserId);
		}
		if (usertObj == null) {
			throw new Exception("Bad Credentials");

		}
		if (usertObj.getPassword().equals(tempPass)) {
			return usertObj;
		} else {
			throw new Exception("Something went Wrong!!!");
		}
	}

	@GetMapping("/viewRequests")
	public List<RegisterChallenger> viewRequests() {
		return adminService.viewRequests();
	}

	@PostMapping("/acceptRequest")
	public boolean acceptRequest(@RequestBody String email) {
		return adminService.acceptRequest(email);
	}

	@PostMapping("/rejectRequest")
	public void rejectRequest(@RequestBody String email) {
		adminService.deleteRequest(email);
	}

	@GetMapping("/returnAllUsers")
	public List<Users> returnAllUsers() {
		return userService.findAllUsers();
	}

	@PostMapping("/deleteUser")
	public void deleteUser(@RequestBody String email) {
		userService.deleteUser(email);
	}

	@PostMapping("/viewMonthlyLogs")
	public List<ChallengerMonthlyLogs> viewMonthlyLogs(@RequestBody String email) {
		return adminService.viewMonthlyLogs(email);
	}

	@GetMapping("/returnAllChallengers")
	public List<Users> returnAllChallengers() {
		return adminService.returnAllChallengers();
	}

	@PostMapping("/saveMonthlyLogs")
	public String saveMonthlyLogs(@RequestBody ChallengerMonthlyLogs log) {
		challengerService.saveMonthlyLogs(log);
		return "updated";
	}

	@PostMapping("/addMessage")
	public String addMessage(@RequestBody Message message) {
		challengerService.addMessage(message);
		return "updated";
	}

	@PostMapping("/viewMessage")
	public List<Message> viewMessage(@RequestBody String email) {
		return challengerService.viewMessage(email);
	}

	@PostMapping("/deleteMessage")
	public String deleteMessage(@RequestBody int id) {
		challengerService.deleteMessage(id);
		return "deleted";
	}

	@PostMapping("/saveDailyLog")
	public String saveDailyLog(@RequestBody DailyLog log) {
		System.out.println("update log");
		challengerService.saveDailyLog(log);
		return "updated";
	}

	@PostMapping("/viewDailyLog")
	public List<DailyLog> viewDailyLog(@RequestBody String email) {
		return adminService.viewDailyLog(email);
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file,
			@RequestParam("batchDetails") String batchDetails) throws IOException {
		DietPlanFile dietPlanFile = new ObjectMapper().readValue(batchDetails, DietPlanFile.class);
		dietPlanFile.setFileName(file.getOriginalFilename());
		dietPlanFile.setFile(file.getBytes());
		dietPlanFile.setFileType(file.getContentType());
		adminService.uploadFile(dietPlanFile);
		return "uploaded";
	}

	@PostMapping("/getFiles")
	public List<DietPlanFile> getFiles(@RequestBody String email) {
		return challengerService.getFiles(email);
	}

	@PostMapping("/downloadFile")
	public ResponseEntity<ByteArrayResource> getFile(@RequestBody int id) {
		DietPlanFile file = challengerService.getFile(id).get();
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(file.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment:filename=\"" + file.getFileName() + "\"")
				.contentType(MediaType.parseMediaType("application/octet-stream"))
				.body(new ByteArrayResource(file.getFile()));
	}

	@GetMapping("/getBatches")
	public List<BatchDetails> getBatches() {
		return adminService.getBatches();
	}

	@GetMapping("/getMentors")
	public List<Users> getMentors() {
		return adminService.getMentors();
	}

	@PostMapping("/assignMentor")
	public String assignMentor(@RequestParam("name") String name, @RequestParam("batchId") String batchId) {
		System.out.println(name + " " + batchId);
		adminService.assignMentor(name, batchId);
		return "updated";
	}

	@PostMapping("/changePassword")
	public String changePassword(@RequestBody Users user) {
		return userService.changePassword(user);
	}
}