package com.ea.redsea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ea.redsea.dao.UserCredentialsDao;
import com.ea.redsea.domain.UserCredentials;



@Service
@Transactional 
public class UserCredentialsServiceImpl implements com.ea.redsea.service.UserCredentialsService {
	
 	@Autowired
	private UserCredentialsDao userCredentialsDao;

 	
    public void save( UserCredentials userCredentials) {  		
 		userCredentialsDao.save(userCredentials);
	}
 	
    public void update( UserCredentials userCredentials) {  		
 		userCredentialsDao.update(userCredentials);
	}
 	
  	
	public List<UserCredentials> findAll() {
		return (List<UserCredentials>)userCredentialsDao.findAll();
	}
	
	public UserCredentials findOne(Long id){
		return userCredentialsDao.findOne(id);
	}


	public UserCredentials findByUserName(String userName) {
		return userCredentialsDao.findByUserName(userName);
	}

}
