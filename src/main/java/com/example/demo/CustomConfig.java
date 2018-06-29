package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("custom")
public class CustomConfig {
	private String value;
	private String valueTwo;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(String valueTwo) {
		this.valueTwo = valueTwo;
	}
	
	
}
