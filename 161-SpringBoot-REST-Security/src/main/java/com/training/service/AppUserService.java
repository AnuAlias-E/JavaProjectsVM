package com.training.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.db.AppUserRepository;
import com.training.model.AppUser;

@Service
public class AppUserService implements UserDetailsService {
	@Autowired
	AppUserRepository repo;
	

	public AppUser addUser(AppUser appUser) {
		return repo.save(appUser);
	}

	public AppUser findByUserName(String userName) {
		return repo.findByUserName(userName);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("This load user function is working");
		System.out.println(username);
	
		User user ;
		AppUser appUser = this.repo.findByUserName(username);
		user = new User(appUser.getUserName(), appUser.getPassword(), new ArrayList<>());
		System.out.println(appUser.getUserName() + "," + appUser.getPassword());
		return user;
	}

}
