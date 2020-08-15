package com.wipro.dietManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dietManagement.Pojo.RegisterChallenger;
import com.wipro.dietManagement.Pojo.Users;
import com.wipro.dietManagement.repository.RegisterRepository;
import com.wipro.dietManagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	@Autowired
	private RegisterRepository regisRepo;

	public RegisterChallenger userSave(RegisterChallenger user) {
		return regisRepo.save(user);

	}

//for registration
	public boolean fetchUserByUserID(String email) {
		return regisRepo.existsById(email);
	}

	public Users fetchUserByUserIDAndPassword(String email) {
		return repo.findByUsername(email);
	}

	public List<Users> findAllUsers() {
		return repo.findAll();
	}

	public void deleteUser(String email) {
		Users user=repo.findById(email).get();
		if(user.getRole().equals("challenger"))
			regisRepo.deleteById(email);
		repo.deleteById(email);
	}

	public String changePassword(Users user) {
		Users user2=repo.findByUsername(user.getUsername());
		user2.setPassword(user.getPassword());
		repo.save(user2);
		return "Password Changed";
	}
}
