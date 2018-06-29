package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudyUnitTestApplicationTests {

	@Autowired
	private ToDoController  controller;
	
//	@Test
//	public void testToDoController() {
//		ToDo todo = controller.get(1l);
//		
//		assertThat(todo).isNotNull();
//		assertThat(todo.getId()).isEqualTo(1l);
//		assertThat(todo.getSummary()).isEqualTo("1반환일");
//	}

}
