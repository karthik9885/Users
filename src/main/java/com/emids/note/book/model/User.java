package com.emids.note.book.model;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="user")
//@Table(name = "user")
public class User {
// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 //@Column(name = "username")
 private String username;
 //@Column(name = "password")
 private String password;
 //@Column(name="name")
 private String name;
 //@Column(name="emailid")
 private String emailid;
 
 
// Default constructor
public User() {
	super();
}
public User(String username, String password, String name, String emailid) {
	super();
	this.username = username;
	this.password = password;
	this.name = name;
	this.emailid=emailid;
	
}

public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}