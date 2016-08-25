package com.luo.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luo.bean.User;
import com.luo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Component(value="userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService us;
	
	
	private String username;
	private String password;
	private String repassword;
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	
	public UserService getUs() {
		return us;
	}
	@Resource(name="us")
	public void setUs(UserService us) {
		this.us = us;
	}
	
	@Override
	public String execute() throws Exception {
		if(username == null || username.trim().hashCode() == 0)
			username = "路上的否的";
		if(username != null && username.trim().hashCode() != 0) {
			User user = new User();
			user.setName(username);
			us.save(user);
			return SUCCESS;
		} else 
			return INPUT;
	}
	
}
