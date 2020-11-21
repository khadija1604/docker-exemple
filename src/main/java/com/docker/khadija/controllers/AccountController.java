package com.docker.khadija.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@GetMapping("/docker")
	public String getDocker() {
		return "Welcome to docker demonstration by Khadija";
	}
}
