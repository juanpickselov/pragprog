package com.juanpickselov.pragprog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * All the web app configuration happens here
 * 
 * @author juanpickselov
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.juanpickselov.pragprog.web.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
