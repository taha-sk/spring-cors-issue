package com.example.corsspring;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.corsspring.controller.ResourceController;

@SpringBootTest
class CorsSpringApplicationTests {
	
	//This is server sanity check
	
	@Autowired
	private ResourceController resourceController;

	@Test
	void contextLoads() {
		assertNotNull(resourceController);
	}

}
