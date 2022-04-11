package com.example.rest;

import com.example.rest.database.Database;
import com.example.rest.response.LocationResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class RestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

//	@Test
//	public void postTest() throws Exception{
//		mockMvc.perform(MockMvcRequestBuilders.post("http://localhost:8080/api/locations"))
//				.andDo(Moc)
//	}

	@Test
	public void getSingleLocationTest() throws Exception{
		Database database = new Database();
		database.put(new LocationResponse(1,2,3));

		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/locations/1"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is(200))
				.andExpect(MockMvcResultMatchers.jsonPath("$.deviceId", Matchers.is(1)));
	}

}
