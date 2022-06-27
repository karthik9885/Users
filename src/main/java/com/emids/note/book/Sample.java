package com.emids.note.book;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = Jwts.builder().setId("siva").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "usersecretkey").compact();
		System.out.println(token);

	}

}
