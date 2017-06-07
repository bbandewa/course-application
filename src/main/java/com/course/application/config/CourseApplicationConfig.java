package com.course.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:foo.properties")
public class CourseApplicationConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigIn() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
