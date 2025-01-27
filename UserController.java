package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Users;
import com.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	@PostMapping("/insertuserdata")
	public String InsertUserData( @RequestBody Users user) {
		System.out.println(user);
		return us.InsertUserData(user); 
	}
	
	@DeleteMapping("/deleteuserdata/{user_id}")
	public String InsertUserData(@PathVariable int user_id) {
		return us.DeleteUserData(user_id); 
	}
	
	@PutMapping("/updateuserdata/{user_id}")
	public String UpdateUserData(@RequestBody Users user,@PathVariable int user_id) {
		return us.UpdateUserData( user,user_id); 
	}
	
	@GetMapping("/getsingleuserdata/{user_id}")
	public Users GetSingleUserData(@PathVariable int user_id) {
		return us.GetSingleUserData(user_id); 
	}
	
	@GetMapping("/fetchalluserdata")
	public List<Object> FetchAllUserData() {
		return us.GetAllUserData();
	}

}
