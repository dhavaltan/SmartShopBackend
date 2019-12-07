package com.cognizant.smartshop.service;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.smartshop.controller.AuthenticationController;
import com.cognizant.smartshop.model.AppUser;
import com.cognizant.smartshop.model.Role;
import com.cognizant.smartshop.model.User;
import com.cognizant.smartshop.repository.IUserRepository;


@Service
public class AppUserDetailService implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private IUserRepository userRepository;

	AppUser appUser;
	User user;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		user = userRepository.getByUserId(userId);
	System.out.println("inside APPUSERDETAILSERVICE " + user);
		if (user == null) {
			LOGGER.info("USER NOT FOUND");
			throw new UsernameNotFoundException("Username not found");
		} else {
			appUser = new AppUser(user);
		}
		System.out.println("inside APPUSERDETAILSERVICE appuser " + appUser);

		return appUser;
	}
	
	public void signUp(User user, boolean isManager) throws Exception{
		User userObj = userRepository.getByUserId(user.getUserId());
		
		
		/*if (userObj == null) {
			LOGGER.info("USER NOT FOUND");
			throw new Exception("User already exists");
		} else {*/
			System.out.println(user);
			String pass = user.getPassword();
			user.setPassword(passwordEncoder().encode(pass));
			userRepository.save(user);
			
			  User newUser = userRepository.getByUserId(user.getUserId());
			  if(isManager)
			  {
				  userRepository.addUserRole(newUser.getUserId(),2);
			  }
			  else{
				  userRepository.addUserRole(newUser.getUserId(), 3);
			  }	  
		}
	//}
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
