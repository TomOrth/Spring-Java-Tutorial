package com.spring.tutorial.learn;

/**
 * <p>Simple data class</p>
 * @author tom
 *
 */
public class HelloWorld {
	private String message;
	
	/**
	 * <p>Sets message</p>
	 * @param message the message
	 */
	public void setMessage(String message){
		this.message = message;
	}
	/**
	 * <p>Prints message</p>
	 */
	public void getMessage(){
		System.out.println("Your Message is: " + message);
	}
}
