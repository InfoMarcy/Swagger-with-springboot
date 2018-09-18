package com.kubernetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes.model.User;
import com.kubernetes.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepository userService;

	// Get a list of all the employesss
	@GetMapping()
	public List<User> findAll() {
		return userService.getAll();
	}

	// get an employee by id
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") String id) {
		return userService.getUserById(id);
	}

	// get an employee by username
	@GetMapping("/username/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		return userService.getUser(username);
	}

	
	// add a new employee
	@RequestMapping(method = RequestMethod.POST)
	public List<User> AddEmployee(@RequestBody User user) {
		return userService.save(user);
	}
	

	// delete an employee
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public List<User> delete(@PathVariable String id) {

		try {
			User user = userService.getUserById(id);
			if (user != null) {
				return userService.delete(user);
			}

		} catch (Exception e) {
		}

		return null;

	}

}
