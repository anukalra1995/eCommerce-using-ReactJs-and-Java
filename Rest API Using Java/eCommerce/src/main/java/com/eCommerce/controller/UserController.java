package com.eCommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.Model.User;
import com.eCommerce.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		System.out.println("In getting user list");
		return userRepo.findAll();
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> registration(@Valid @RequestBody User userForm) {
		System.out.println(userForm);
		userRepo.save(userForm);
		return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
	}
}
