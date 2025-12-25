package dinossaur;
import java.util.Scanner;
public class projectMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourName;
		String openingHours = "08 AM";
		String closingHours = "08 PM";
		
		System.out.println("Welcome to Mesozoic Eden!");
		System.out.println("I'm Claudio and I will be your guide to Eden.");
		System.out.printf("Our opening hours are from %s to %s.%n", openingHours, closingHours);
		System.out.println("What's your name?");
		yourName = sc.next();
		System.out.printf("%s, that's a nice name!%n", yourName);
		System.out.println("The Mesozoic Eden is secure and safe for all visitors.");
	}
	

}
