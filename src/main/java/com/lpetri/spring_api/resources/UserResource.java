package com.lpetri.spring_api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpetri.spring_api.entities.User;

@RestController

@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "aa", "aa", "aa", "aa");
		
		return ResponseEntity.ok().body(u);
	}

}
