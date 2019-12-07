package com.cognizant.smartshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshop.model.User;
import com.cognizant.smartshop.service.AppUserDetailService;
import com.cognizant.smartshop.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@Autowired
	AppUserDetailService appUserDetailService;
	
	@GetMapping("/resetpassword/{userId}")
	public String[] getSecurityQuestionAndAnswer(@PathVariable String userId)
	{
		return userService.getSecurityQuestionAndAnswer(userId);
	}
	
	@PostMapping("/resetpassword/{userId}/{newPassword}")
	public void setNewPassword(@PathVariable String userId,@PathVariable String newPassword) {
		userService.setNewPassword(newPassword,userId);
	}
	
	
	@GetMapping()
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public User getByUserId(@PathVariable String userId){
		return userService.getByUserId(userId);
	}
	
	@GetMapping("/managers")
	public List<User> getAllManagers() {
		return userService.getAllManagers();
	}
	
	@GetMapping("/managers/pending")
	public List<User> getAllPending() {
		return userService.getAllPending();
	}
	
	@GetMapping("/managers/approved")
	public List<User> getAllApproved() {
		return userService.getAllApproved();
	}
	 
	@PostMapping("/{isManager}")
	public void addUser(@RequestBody User user, @PathVariable("isManager")boolean isManager) throws Exception {
		//userService.addUser(user);
		appUserDetailService.signUp(user, isManager);
		
	}
	
	@PutMapping("/managers/{userId}")
	public void changeStatus(@PathVariable("userId") String userId) {
		userService.changeStatus(userId);
	}
	
	
	
}
