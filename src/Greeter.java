
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
	
	
	

