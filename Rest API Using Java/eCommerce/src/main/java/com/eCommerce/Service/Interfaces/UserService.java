package com.eCommerce.Service.Interfaces;

import com.eCommerce.Model.User;

public interface UserService {
	
	void save(User user);

    User findUsername(String username);
    
}
