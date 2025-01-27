package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDAO;
import com.spring.entity.Users;

@Service
public class UserService {
	
	@Autowired
	UserDAO ud;
	
	public String InsertUserData(Users user) {
		return ud.insertUserData(user);
	}
	
	public String DeleteUserData(int user_id) {
		return ud.DeleteUserData(user_id);
	}
	
	public String UpdateUserData( Users user,int user_id) {
		return ud.UpdateUserData( user,user_id);
	}
	
	public Users GetSingleUserData( int user_id) {
		return ud.GetSingleUserData(user_id);
		}
	
	
	public List<Object> GetAllUserData() {
		return ud.FetchAllUserData();
	}
}
