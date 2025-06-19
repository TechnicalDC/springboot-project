package com.technicaldc.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.technicaldc.demo.entity.UserEntity;
import com.technicaldc.demo.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	private final UserService userService;

	@GetMapping("/users")
	public List<UserEntity> getAllUser() {
		return userService.getUsers();
	}
}
