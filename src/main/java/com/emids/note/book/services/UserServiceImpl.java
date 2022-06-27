package com.emids.note.book.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.note.book.model.User;
import com.emids.note.book.repo.UserRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService {
	private static Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepo repo;
	
	public User registeruser(User re) {
		User user=null;
		try {
			user=repo.save(re);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return user;
	}
	
	public List<User> login(String username, String password) {
			List<User> list = null;
			try {
			list =repo.findByUsernameAndPassword(username, password);
			}
			catch(Exception e) {logger.error("error while login");}
			return list;
	}
	
	public User getUserByUsername(String username)  {
		
		return repo.findByUsername(username);
	}

}
