package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration 
{
	@Bean(name="employee")
	public Mybean getEmployeeBean()
	{
		System.out.println("===Spring Container Created the Employee Bean and Stored");
		return new Mybean();
	}
}