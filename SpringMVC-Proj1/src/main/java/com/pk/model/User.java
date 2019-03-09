package com.pk.model;

public class User {
	private String uname;
	private String email;
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uName) {
		this.uname = uName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [uName=" + uname + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
}
