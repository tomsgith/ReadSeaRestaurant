package com.ea.redsea.service;

import java.util.List;

import com.ea.redsea.domain.UserCredentials;


 
public interface UserCredentialsService {

	public void save(UserCredentials userCredentials);
	public void update(UserCredentials userCredentials);
	public List<UserCredentials> findAll();
	public UserCredentials findOne(Long id);
	public UserCredentials findByUserName(String userName);
 }
