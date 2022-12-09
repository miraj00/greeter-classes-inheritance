
public class LoudGreeter extends Greeter {
	private static String extra = "!";
	

	public LoudGreeter(String greeting) {
		super(greeting);
	}
	
	public static void addVolume() {
	 	extra += extra ; 
	 //	System.out.println(extra);
	}
	
	
	@Override
	public String greet(String name) {	
		addVolume();
	//	return  greeting + ", " + name + "!" + extra ;        ( option )
		return super.greet(name) + extra;
	}

	
	

}

