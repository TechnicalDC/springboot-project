package com.technicaldc.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.technicaldc.demo.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	private final UserService userService;

}
