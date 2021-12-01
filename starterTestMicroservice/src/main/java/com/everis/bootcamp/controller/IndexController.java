package com.everis.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import starter.Saludo;

@Controller
public class IndexController {
	
	@Autowired
	private Saludo saludo;
	
	public IndexController() {
		
	}
	
	@GetMapping("/")
	public ResponseEntity<String> index() {
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}

}
