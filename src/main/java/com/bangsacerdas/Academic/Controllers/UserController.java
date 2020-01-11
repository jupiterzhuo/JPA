package com.bangsacerdas.Academic.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String listUser() {
		return "List User";
	}
	
	@PostMapping
	public String addUser() {
		return "Add User";
	}
	
	@PutMapping
	public String editUser() {
		return "Edit User";
	}
	
	@DeleteMapping
	public String DeleteUser() {
		return "Delete User";
	}
	

	
}
