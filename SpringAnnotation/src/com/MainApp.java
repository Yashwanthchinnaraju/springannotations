package com;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Mybean;

public class MainApp 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		
		context.refresh();
	
		Mybean employee=(Mybean)context.getBean("employee");
		
		employee.setEmpId("2012bee315");
		employee.setEmpName("Praveen");
		employee.setSalary(75000);
		
		System.out.println("Employee ID:"+employee.getEmpId());
		System.out.println("Employee Name:"+employee.getEmpName());
		System.out.println("Employee Salary:"+employee.getSalary());
	}
}