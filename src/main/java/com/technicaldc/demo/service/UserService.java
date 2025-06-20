package com.technicaldc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.technicaldc.demo.entity.UserEntity;
import com.technicaldc.demo.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}

	public UserEntity createUser(UserEntity user) {
		userRepository.save(user);
		return user;
	}
}
