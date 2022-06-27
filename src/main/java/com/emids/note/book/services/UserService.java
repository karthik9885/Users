package com.emids.note.book.services;

import java.util.List;

import com.emids.note.book.model.User;

public interface UserService {
	public List<User> login(String username, String password);
	public User registeruser(User re);
	
	
	public User getUserByUsername(String username);
}
