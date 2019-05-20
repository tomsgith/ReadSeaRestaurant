package com.ea.redsea.service;

import java.util.List;


import com.ea.redsea.domain.User;

 
public interface UserService {

	public void save(User user);
  		
	public void update(User user);
	public List<User> findAll();
	public void delete(Long id);
	

	public User findOne(Long id);
	
	
	
		
}
