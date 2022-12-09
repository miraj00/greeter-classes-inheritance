import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GreeterTest {

	@Test
	void GreeterTest1() {
	
		Greeter g1 = new Greeter("Comosta");
		// System.out.println(g1.greet("Simon"));
	
		String expected = "Comosta, Simon!";
		String actual = g1.greet("Simon") ;
		assertEquals(expected, actual );
	}
	
	
	@Test
	 void GreeterTest2() {
		
		 Greeter g1 = new Greeter("Salame");
			
		String expected = "Salame, Bhaijan!";
		String actual = g1.greet("Bhaijan") ;
		assertEquals(expected, actual );
	}


	@Test
	 void SimonGreeterTest() {
		
		SimonGreeter s1 = new SimonGreeter("Kepaso");
			
		String expected = "Simon Says, Kepaso, Cheekita!";
		String actual = s1.greet("Cheekita") ;
		assertEquals(expected, actual );
	}


	@Test
	 void LoudGreeterTest() {
		
		LoudGreeter l1 = new LoudGreeter("Hello");
			
		String expected = "Hello, Grant!!!";
		String actual = l1.greet("Grant") ;
		assertEquals(expected, actual );
	}

	
	@Test
	 void HtmlGreeterTest() {
		
		HtmlGreeter h1 = new HtmlGreeter("Kem Chho");
			
		String expected = "<h1>Kem Chho, Popatlal!</h1>";
		String actual = h1.greet("Popatlal") ;
		assertEquals(expected, actual );
	}

	@Test
	 void HtmlGreeterTest2() {
		
		HtmlGreeter h2 = new HtmlGreeter("Kem Chho", "h3");
			
		String expected = "<h3>Kem Chho, Popatlal!</h3>";
		String actual = h2.greet("Popatlal") ;
		assertEquals(expected, actual );
	}


}
