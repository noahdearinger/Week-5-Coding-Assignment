import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in); //scanner to receive input
	
	public static void main(String[] args) {
		
	
	System.out.println("Please type any word!");
	String word = sc.next();
	System.out.println("");
	System.out.println("Asterisk Logger function: ");
	System.out.println("");
	
	Logger aLogger = new AsteriskLogger();
	aLogger.Log(word);
	System.out.println("");
	aLogger.Error(word);
		
	System.out.println("\\\\\\\\");
	System.out.println("");
	System.out.println("\nSpaced Logger function");
	System.out.println("");
	
	Logger sLogger = new SpacedLogger();
	sLogger.Log(word);
	System.out.println("");
	sLogger.Error(word);
	
	System.out.println("\\\\\\\\");
	System.out.println("Program over! Thanks!");
	}


}
