package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String username;

	@Column
	private String password;

	@Column(name = "user_type")
	private String userType;

	@Column
	private String email;

	@Column
	private String mobile;

	public User() {

	}

	public User(String username, String password, String userType, String email, String mobile) {
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public long getId() {
		return id;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getUserType() {
		return userType;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

}
