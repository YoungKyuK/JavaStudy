package com.example.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	private String connectPath = "/upload/**";
	private String resourcePath = "file:///home/ubuntu/upload/";
	
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler(connectPath)
			.addResourceLocations(resourcePath)
			.resourceChain(true)
			.addResolver(new PathResourceResolver());
	}
}
