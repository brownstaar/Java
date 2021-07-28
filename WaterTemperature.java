
package project3;
import java.util.Scanner;

public class WaterTemperature {

	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// create random temperature between 50 and 150
		final int min = 50;
		final int max = 150;		
		int randomTemp = (int) (Math.random() * (max - min + 1) + min);
		
		// prompt user to guess the temperature
		System.out.print("Enter the temperature beans cook at (Should be between 50 and 150): ");
		int guessTemp = input.nextInt();
		
		// logic statement
		if (randomTemp < 100)
			System.out.print("The water temperature is " + randomTemp + " C and is not hot enough to cook beans");
		else if (randomTemp == 100)
			System.out.print("The water temperature is " + randomTemp + " C and is exactly hot enough to cook beans");
		else if (randomTemp > 100)
			System.out.print("he water temperature is " + randomTemp + " C and is hot enough to cook beans");
		

	}

}
