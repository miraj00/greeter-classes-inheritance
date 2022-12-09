import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose a greeting :");
		String greetingWord = sc.nextLine();
			
		System.out.print("Enter you name :");
		String name = sc.nextLine();
		
		
		
		Greeter g1 = new Greeter(greetingWord);
		System.out.println(g1.greet(name));
		
		
		SimonGreeter s1 = new SimonGreeter(greetingWord);
		System.out.println(s1.greet(name));
		
		
		
		LoudGreeter l1 = new LoudGreeter("Say it Loud");
		System.out.println(l1.greet(name));
		
		
		HtmlGreeter h1 = new HtmlGreeter("Kem Chho");
		System.out.println(h1.greet(name));
		
		HtmlGreeter h2 = new HtmlGreeter("Kem Chho", "h3");
		System.out.println(h2.greet(name));
		
	}

}




/*
 *GREETER CLASSES
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

SimonGreeter Class (Part 2)
Create a class named SimonGreeter. This is a subclass of Greeter.
Additional Fields: n/a
Additional Methods: n/a
Override greet: Override the greet method to wrap the greeting with "Simon says". Include quotes around the greeting. For example, greet might return "Simon Says, "Hello, Grant!"".
JUnit Tests: Test with different greetings and names.

LoudGreeter Class (Part 2)
Create a class named LoudGreeter. This is a subclass of Greeter.
Additional Fields:
extra (a String): Use the private modifier. This field keeps track of the extra exclamation points. Hard code an initial value to "!". Do not add getter or setter for this.
Additional Methods:
addVolume: No parameters. Returns void. Every time this is called, it adds an additional exclamation point to extra.
Override greet: Override the greet method to add the extra exclamation points to the end. For example, greet might return "Hello, Grant!!!". Note, the original greet method already has one exclamation point, so LoudGreeter starts with two exclamation points even before calling addVolume.
JUnit: Test with and without calling addVolume. Test calling addVolume different numbers of times.

HtmlGreeter Class (Part 2)
Create a class named HtmlGreeter. This is a subclass of Greeter.
Additional fields:
tagName (a String). Include public getter and setter.
2 Constructors
Constructor One:
greeting (a String): sets greeting on the superclass.
Always sets tagName to "h1".
Constructor Two:
greeting (a String): sets greeting on the superclass.
tagName (a String): sets the tagName field.
Override greet: Override the greet method to wrap the result in the specified HTML tag. For example, greet might return "<h1>Hello, Grant!</h1>".
JUnit Tests: Test with different greetings, names, and tagNames. Also test the default "h1" tagName when the first constructor is used.

 */
