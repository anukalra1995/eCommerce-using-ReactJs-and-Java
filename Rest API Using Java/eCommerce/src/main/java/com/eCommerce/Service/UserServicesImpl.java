package com.eCommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.eCommerce.Model.User;
import com.eCommerce.Service.Interfaces.UserService;
import com.eCommerce.repository.UserRepository;

public class UserServicesImpl implements UserService{

	@Autowired
    private UserRepository userRepository;
	
	@Override
	public void save(User user) {
		System.out.println(user);
		
	}

	@Override
	public User findUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(username);
	}

}
