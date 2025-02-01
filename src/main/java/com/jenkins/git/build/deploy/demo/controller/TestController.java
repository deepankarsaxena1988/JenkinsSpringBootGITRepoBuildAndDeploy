package com.jenkins.git.build.deploy.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping(path = "/testControllerJenkinsGIT")
	public ResponseEntity<String> testController(){
		return new ResponseEntity("Success", HttpStatus.OK);
	}

}
