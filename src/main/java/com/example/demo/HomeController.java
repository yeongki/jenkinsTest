package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@Value("${custom.value}")
	private String customValue;
	
	@Autowired
	private CustomConfig config;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("value", customValue);
		model.addAttribute("configValue", config.getValue());
		model.addAttribute("configValueTwo", config.getValueTwo());
		return "index";
	}
	
	@RequestMapping("/2")
	public @ResponseBody String index2() {
		return "index";
	}
	
	@RequestMapping("/3")
	public @ResponseBody String index3() {
		return "index";
	}
}
