package com.simple.api.domain;

public class User {

	String userName;
	boolean isAgent;
	private String name;
	private String surName;

	public User(String userName, boolean isAgent) {
		this.userName = userName;
		this.isAgent = isAgent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public boolean isAgent() {
		return isAgent;
	}
}
