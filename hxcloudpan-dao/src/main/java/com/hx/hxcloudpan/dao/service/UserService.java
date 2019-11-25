package com.hx.hxcloudpan.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.hxcloudpan.dao.entity.UserEntity;
import com.hx.hxcloudpan.dao.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository drep;

	public UserEntity save(UserEntity user) {
		return drep.save(user);
	}
	

}
