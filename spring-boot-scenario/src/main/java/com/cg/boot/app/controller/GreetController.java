package com.cg.boot.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *{@link GreetController} attend to all the rest requests with URI 
 * @author nisjani
 *
 */
@RestController
@RequestMapping("/greet")
public class GreetController {

	/**
	 * this method greets the user with a generic message.
	 * it returns a {@link HttpStatus} of OK(200).
	 * @return response {@link ResponseEntity} of type {@link String}
	 */
	@GetMapping
	public ResponseEntity<String> greet() {
		return new ResponseEntity<>("hi...", HttpStatus.OK);
	}

	/**
	 * this message greets a user by name.
	 * @param name {@link PathVariable}}
	 * @return response {@link ResponseEntity} of type {@link String}
	 */
	@GetMapping(value ="/{name}")
	public ResponseEntity<String> greetByName(@PathVariable String name) {
		return new ResponseEntity<>("Hi" + " " + name + " welcome", HttpStatus.OK);
	}
}
