package com.technicaldc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class SiteController {

	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

}
