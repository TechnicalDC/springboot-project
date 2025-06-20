package com.technicaldc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.technicaldc.demo.entity.UserEntity;
import com.technicaldc.demo.service.Message;
import com.technicaldc.demo.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserEntity> getUsers() {
		return userService.fetchUsers();
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<UserEntity> getUser(@PathVariable Long id) {
		var user = userService.fetchUser(id);
		return ResponseEntity.ok(user);
	}

	@PostMapping("/users")
	private ResponseEntity<UserEntity> addUser(
		@RequestBody UserEntity user,
		UriComponentsBuilder uriComponentsBuilder) {

		var entity = userService.createUser(user);

		var uri = uriComponentsBuilder
			.path("/user/{id}")
			.buildAndExpand(entity.getId())
			.toUri();

		return ResponseEntity.created(uri).body(entity);
	}


	@PostMapping("/user")
	private ResponseEntity<Message> updateUser(
		@RequestBody UserEntity user) {

		var msg = userService.updateUser(user);

		return ResponseEntity.ok(msg);
	}
}
