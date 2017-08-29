package com.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring_jdbc/applicationContext.xml");
		Object o = ctx.getBean("db");
		DemoBean db = (DemoBean) o;
		db.insertStudent(112, "Neha", 22);
		db.updateStudent(1123, "krishna", 19);
		System.out.println(db.selectStudent());

	}
}
