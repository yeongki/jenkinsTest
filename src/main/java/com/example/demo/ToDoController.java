package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
	
	@Autowired
	private ToDoService service;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ToDo get(@PathVariable Long id) {
		return service.get(1l);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ToDo get(ToDo todo) {
		return service.add(todo);
	}
}
