package com.eCommerce.security.services;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.eCommerce.Model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String email;
	
	@JsonIgnore
	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailImpl(Long id, String email, String password, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}
	
	public static UserDetailImpl build(User user) {
		Set < GrantedAuthority > grantedAuthorities = new HashSet < > ();
		grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
		
	    return new UserDetailImpl(
	        user.getId(), 
	        user.getEmail(),
	        user.getPwd(), 
	        grantedAuthorities);
	  }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}
