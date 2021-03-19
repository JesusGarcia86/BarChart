import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) {
		
		double userInput;
		int numberOfStores = 5;
		double hundredNumber;
		String header = "SALES BAR CHART\n";
		
		Scanner keyboard = new Scanner(System.in);
		
		for( int store = 1; store <= numberOfStores; store++ ) {
			System.out.println("Enter sales for store " + store + ":");
			userInput = keyboard.nextDouble();
			hundredNumber = userInput / 100;
			header +=  "Store " + store + ": ";
			for( int printAsterisk = 1; printAsterisk <= hundredNumber; printAsterisk++ ) {
				header += "*";
			}
			header += "\n";
		}
		System.out.println(header);
		System.exit(0);
	}

}
