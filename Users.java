package com.spring.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	private int user_id;
	private String user_name;
	private String user_password;
	private String user_email;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int user_id, String user_name, String user_password, String user_email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_email=" + user_email + "]";
	}

}