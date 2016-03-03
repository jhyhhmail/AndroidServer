package com.jhy.server.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jhy.server.entity.SysUserEntity;
import com.jhy.server.login.service.LoginService;
import com.jhy.server.utils.MainHelper;

@Repository
@Transactional
public class LoginServiceImpl implements LoginService {
 
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<SysUserEntity> getUsers() {
		List result  = sqlSession.selectList("com.jhy.userMapper.getAllUser");
		deleteUsers();
//		insertUser(new SysUserEntity("userName", "220000", "userCode-one","120000"));
//		insertUsers();
		return result;
	}
	
	public int insertUser(SysUserEntity user){ 
		return sqlSession.insert("com.jhy.userMapper.insertUser", user); 
	}
	
	public void insertUsers(){
		List<SysUserEntity> users = new ArrayList<SysUserEntity>();
		users.add(new SysUserEntity("userName", "220000", "userCode-1","120000"));
		users.add(new SysUserEntity("userName", "220000", "userCode-2","120000"));
		users.add(new SysUserEntity("userName", "220000", "userCode-3","120000"));
		users.add(new SysUserEntity("userName", "220000", "userCode-4","120000"));
		users.add(new SysUserEntity("userName", "220000", "userCode-5","120000"));
		users.add(new SysUserEntity("userName", "220000", "userCode-6","120000"));
		sqlSession.insert("com.jhy.userMapper.insertUsers", users); 
	}
	
	public void deleteUsers(){
		List<String > userCodes = new ArrayList<String>();
		userCodes.add("userCode-1");
		userCodes.add("userCode-2");
		userCodes.add("userCode-3");
		userCodes.add("userCode-4");
		userCodes.add("userCode-5");
		userCodes.add("userCode-6");
		userCodes.add("userCode-7");
		userCodes.add("userCode-one");
		sqlSession.insert("com.jhy.userMapper.deleteUsers", MainHelper.listtoString(userCodes)); 
	}

	public static void main(String[] args){
		List<String > userCodes = new ArrayList<String>();
		userCodes.add("userCode-1");
		userCodes.add("userCode-2");
//		Collections.
		System.out.println(MainHelper.listtoString(userCodes));
		
	}
}
