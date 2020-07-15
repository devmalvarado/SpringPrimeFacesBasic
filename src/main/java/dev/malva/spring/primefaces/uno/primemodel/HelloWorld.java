package dev.malva.spring.primefaces.uno.primemodel;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class HelloWorld {
	private String firstName = "John";
	private String lastName = "Doe";

	public String showGreeting() {
	    return "Hello " + firstName + " " + lastName + "!";
	  }
	
}
