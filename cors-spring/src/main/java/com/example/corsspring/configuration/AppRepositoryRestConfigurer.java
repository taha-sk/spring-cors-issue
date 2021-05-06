package com.example.corsspring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class AppRepositoryRestConfigurer implements RepositoryRestConfigurer {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		cors.addMapping("/**").allowedOrigins("http://localhost:4200").allowedHeaders("*").maxAge(3600L);
	}

}
