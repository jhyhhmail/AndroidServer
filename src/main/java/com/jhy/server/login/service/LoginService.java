package com.jhy.server.login.service;

import java.util.List;

import com.jhy.server.entity.SysUserEntity;

public interface LoginService {
	
	public List<SysUserEntity> getUsers();
	
	public int insertUser(SysUserEntity user);
}
