
public class Greeter {

	public String greeting;                 		  // Field
	
	
	public String getGreeting() {                     // getter
		return greeting;
	}

	public void setGreeting(String greeting) {        // setter   
		this.greeting = greeting;
	}

	public Greeter (String greeting) {					// constructor
		this.greeting = greeting;		
	}
	
	public String greet (String name) {					// method
		return greeting + ", " + name + "!";
	}
	

}	
	
	
	


/*
 * GREETER CLASSES
Classes, Inheritance
Overview: Create a Greeter class and multiple subclasses that each have a different way of greeting someone. This lab can be completed in two parts. Part one is the Greeter class. Part two is the three other subclasses.

Part 1: Build Specifications
Create the Greeter class (see below).
Write at least two JUnit test cases for Greeter to ensure that its functionality is working correctly. Some classes will need more tests to cover all of the features.
Create a GreeterApp class with a main method. Prompt the user for the desired greeting and their name. Then use the Greeter classes to get the greeting produced by the greet method. Print that result within main.

Part 2: Build Specifications
Create three more classes: SimonGreeter, LoudGreeter, and HtmlGreeter. These are all subclasses of Greeter.
Each class must have at least two JUnit test cases to ensure that its functionality is working correctly. Some classes will need more tests to cover all of the features.
In GreeterApp, use each of the three additional classes to print the greeting produced by each class. There should be a total of at least four greetings printed: one by the Greeter parent class from part one and an additional three from the new classes in part two.
For the LoudGreeter, also prompt the user for how much volume to add. Use a loop to call addVolume this many times.
For HtmlGreeter, just use the default "h1" tagName.

Greeter Class (Part 1)
Create a class named Greeter. This becomes the parent class in part 2.
Fields:
greeting (a String). Include public getter and setter.
Methods:
constructor: Sets the greeting field from a parameter.
greet: Has a String parameter called name. It returns the composed greeting based on the greeting field and name parameter. Use this format: "{greeting}, {name}!".
JUnit Tests: Test with different greetings and names.

 * 
 * 
 */
