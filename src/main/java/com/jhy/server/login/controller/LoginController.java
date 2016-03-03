package com.jhy.server.login.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhy.server.entity.SysUserEntity;
import com.jhy.server.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);
    
    @Autowired
    private LoginService service;
    
    @RequestMapping(value="/users",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
    public List<SysUserEntity> getUsers(){
    	List<SysUserEntity> result = service.getUsers();
    	return result ;
    }
    
    @RequestMapping(value = "/insertUser", method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody void merge(@RequestBody SysUserEntity user) {
    	service.insertUser(user);
	}
}
