package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	private ToDoService service;
	
	@RequestMapping("/todo/{id}")
	public String index(@PathVariable Long id, Model model) {
		model.addAttribute("todo", service.get(id));
		return "index";
	}
	
	@RequestMapping("/todo/add")
	public String add(Model model) {
		return "add";
	}
	
}
