package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@MockBean
	private ToDoService service;
	
	@Test
	public void testToDoController() {
		
//		when(service.get(1L)).thenReturn(new ToDo(1L, "1을 리턴해랏"));
//		
//		String url = "http://localhost:" + port + "/api/todo/1";
//		
//		ToDo todo = restTemplate.getForObject(url, ToDo.class);
//		
//		assertThat(todo).isNotNull();
//		assertThat(todo.getId()).isEqualTo(1l);
//		assertThat(todo.getSummary()).isEqualTo("1번할일");
	}

}
