package com.shihao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shihao.mapper.UserMapper;
import com.shihao.model.User;
import com.shihao.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	  @Autowired
	    private UserMapper userMapper;

	@Override
	public User addUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getNewsList(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
