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
	}

}
