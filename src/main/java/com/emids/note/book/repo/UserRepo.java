package com.emids.note.book.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.emids.note.book.model.User;


@CrossOrigin
@Repository
public interface UserRepo extends MongoRepository<User, Integer>{
	public List<User> findByUsernameAndPassword(String username, String password);
	public User findByUsername(String username);

}
