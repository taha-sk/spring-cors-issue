package com.example.corsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.corsspring.model.Widget;
import com.example.corsspring.repository.WidgetRepository;

@SpringBootApplication
public class CorsSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CorsSpringApplication.class, args);
	}
	
	//Initialize some values
	
	@Autowired
	private WidgetRepository widgetRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//Clean up
		widgetRepository.deleteAll();
		
		
		//Insert new
		widgetRepository.save(new Widget("first"));
		widgetRepository.save(new Widget("second"));
		widgetRepository.save(new Widget("third"));
		
	}

}
