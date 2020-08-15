package com.wipro.dietManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.dietManagement.Pojo.Message;

public interface MessageRepository extends JpaRepository<Message, Number> {
	public List<Message> findBySentTo(String email);
	public List<Message> findByFullnameAndSentTo(String batchname,String batchgroup);
 }
