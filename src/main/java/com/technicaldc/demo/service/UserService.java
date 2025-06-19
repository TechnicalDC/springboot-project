package com.technicaldc.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.technicaldc.demo.entity.UserEntity;
import com.technicaldc.demo.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	private final UserRepository userRepository;

	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}
}
