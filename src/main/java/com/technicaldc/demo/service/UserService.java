package com.technicaldc.demo.service;

import org.springframework.stereotype.Service;
import com.technicaldc.demo.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	private UserRepository userRepository;
}
