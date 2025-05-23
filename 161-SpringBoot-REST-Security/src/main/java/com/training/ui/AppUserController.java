package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.config.JwtUtil;
import com.training.dto.request.AppUserAuthenticateRequest;
import com.training.dto.response.AppUserAuthenticateResponse;
import com.training.model.AppUser;
import com.training.service.AppUserService;

@RestController
//@RequestMapping("/api")
public class AppUserController {

	@Autowired
	AppUserService service;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/addNewUser")
	public ResponseEntity<AppUser> addUser(@RequestBody AppUser appUser) {
		appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
		AppUser appUser1 = service.addUser(appUser);
		return ResponseEntity.ok(appUser1);

	}

	@GetMapping("/login")
	public ResponseEntity<AppUserAuthenticateResponse> loginUser(
			@RequestBody AppUserAuthenticateRequest appUserRequest) {
		AppUserAuthenticateResponse appUserAuthenticateResponse = new AppUserAuthenticateResponse();
		System.out.println("App User Rest API Login");

		String userName = appUserRequest.getAppUser().getUserName();
		String password = appUserRequest.getAppUser().getPassword();
		System.out.println(userName);
		System.out.println(password);
	
		try {

			System.out.println("try block");
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));

		} catch (BadCredentialsException e) {
			appUserAuthenticateResponse.setStatusCode(403);
			appUserAuthenticateResponse.setAppUser(appUserRequest.getAppUser());
			appUserAuthenticateResponse.setMessage("Login Failed");
			e.printStackTrace();
			return ResponseEntity.ok(appUserAuthenticateResponse);
		}
		UserDetails userDetails = this.service.loadUserByUsername(userName);
		String jwt = this.jwtUtil.generateToken(userName);

		appUserAuthenticateResponse.setJwt(jwt);
		appUserAuthenticateResponse.setStatusCode(200);
		appUserAuthenticateResponse.setAppUser(appUserRequest.getAppUser());
		appUserAuthenticateResponse.setMessage("Login Successful");

		return ResponseEntity.ok(appUserAuthenticateResponse);
	}
}
