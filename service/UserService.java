package com.cognizant.smartshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.smartshop.model.User;
import com.cognizant.smartshop.repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	IUserRepository userRepository;
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public UserService(){
		
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public List<User> getAllManagers() {
		return userRepository.getAllManagers();
	}
	
	public List<User> getAllPending() {
		return userRepository.getAllPending();
	}
	
	public List<User> getAllApproved() {
		return userRepository.getAllApproved();
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void changeStatus(String userId) {
		User user = userRepository.getByUserId(userId);
		
		if(user.getStatus() == 'P'){
			user.setStatus('A');
		} else {
			user.setStatus('P');
		}	
		userRepository.save(user);
	}
	
	public User getByUserId(String userId) {
		return userRepository.getByUserId(userId);
	}

	public String[] getSecurityQuestionAndAnswer(String userId) {
		return userRepository.getSecurityQuestionAndAnswer(userId);
	}

	public void setNewPassword(String newPassword, String userId) {
		userRepository.setNewPassword(passwordEncoder().encode(newPassword),userId);
	}
}
