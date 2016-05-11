package com.spring.tutorial.learn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reads the xml
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Obtains message from Beans.xml
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		
		obj.getMessage();

	}

}
