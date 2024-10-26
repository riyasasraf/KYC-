package com.bornfire.xbrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/* @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) */
public class XbrlApplication  extends SpringBootServletInitializer{
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(XbrlApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(XbrlApplication.class, args);
	}

}
