package com.wipro.dietManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.dietManagement.Pojo.Users;

public interface UserRepository extends JpaRepository<Users, String> {
	
	public Users findByUsername(String UserID);

	public Users findByUsernameAndPassword(String UserID, String Password);

	public List<Users> findByRole(String role);

	public List<Users> findByRoleAndBatchname(String role, String batchname);

	public Users findByName(String name);
}
