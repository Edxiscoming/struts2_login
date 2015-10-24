package com.edison.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() throws Exception {

		System.out.println("进入login方法处理");
		if("tom".equals(this.getUsername())&&"123".equals(this.getPassword())){
			return "success";
		}else{
			return "fail";
		}
		
	}
	
	
}
