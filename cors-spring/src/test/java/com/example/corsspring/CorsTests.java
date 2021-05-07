package com.example.corsspring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CorsTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void resourceControllerShouldWorkAccoringToCorsMvcDefinitions() throws Exception {
		this.mockMvc.perform(options("/resource")
				.header("Access-Control-Request-Method", "GET")
				.header("Access-Control-Request-Headers", "x-requested-with")
				.header("Origin", "http://localhost:4200")
		).andExpect(status().isOk());
	}
	
	@Test
	void widgetRepositoryShouldWorkAccoringToDataRestCorsDefinitions() throws Exception {
		this.mockMvc.perform(options("/widgets")
				.header("Access-Control-Request-Method", "GET")
				.header("Access-Control-Request-Headers", "x-requested-with")
				.header("Origin", "http://localhost:4200")
		).andExpect(status().isOk());
	}
	
}
