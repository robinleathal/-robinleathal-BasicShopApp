package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDao {
	public void addUsers();
	List<User>viewAllUsers();
	User viewUser(int uId);
	void updateUser(int uId);
	void deleteUser(int uId);
}
