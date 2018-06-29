package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ToDoServiceImpl implements ToDoService{
	
	@Autowired
	private ToDoRepository repo;
	
	@Override
	public ToDo get(Long id) {
		//return new ToDo(id, id + "번할일");
		return repo.getOne(id);
	}
	
	@Override
	public ToDo add(ToDo todo) {
		return repo.save(todo);
	}
}
