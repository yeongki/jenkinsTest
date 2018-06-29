package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MvcTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private ToDoService service;
	
	@Test
	public void testToDoController() throws Exception {
		
//		when(service.get(1L)).thenReturn(new ToDo(1L, "1을 리턴해랏"));
//		
//		mvc.perform(get("/todo/1").accept(MediaType.TEXT_HTML))
//		.andExpect(status().isOk())
//		.andExpect(model().attributeExists("todo"))
//		.andExpect(content().string(containsString("1을 리턴해랏")));
	}

}
