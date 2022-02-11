package com.entity;

public class User {
	private int userID;
	private String userName;
	private String fName;
	private String lName;
	private String passWord;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userID, String userName, String fName, String lName, String passWord) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.fName = fName;
		this.lName = lName;
		this.passWord = passWord;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", fName=" + fName + ", lName=" + lName
				+ ", passWord=" + passWord + "]";
	}
	
}
