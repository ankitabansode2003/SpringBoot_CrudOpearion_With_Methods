package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Users;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class UserDAO {
	
	@Autowired
	SessionFactory sf;
	
	public  String insertUserData(Users user) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return "data inserted successfully..";
		}
	
	public String DeleteUserData(int user_id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Users user=session.get(Users.class, user_id);
		session.remove(user);
		transaction.commit();
		session.close();
		return "data deleted successfully..";
	}
	
	public String UpdateUserData(Users user,int user_id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Users newuser=session.get(Users.class, user_id);
		newuser.setUser_id(user.getUser_id());
		newuser.setUser_name(user.getUser_name());
		newuser.setUser_password(user.getUser_password());
		newuser.setUser_email(user.getUser_email());
		session.update(newuser);
		transaction.commit();
		session.close();
		return "userdata update successfully..";
	}
	
	public Users GetSingleUserData(int user_id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Users user=session.get(Users.class,user_id);
		transaction.commit();
		session.close();
		return user;
	}
	
	public List<Object> FetchAllUserData() {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Object> cq=cb.createQuery();
		Root<Users> root=cq.from(Users.class);
		cq.select(root);
		Query<Object> query=session.createQuery(cq);
		List<Object> list=query.getResultList();
		return list;
		
	}
}
