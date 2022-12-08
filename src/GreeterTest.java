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
}
