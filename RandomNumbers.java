package project5;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//a loop to generate a 100 random variables and compare each variable to the value entered by the user
		int randomNumber;
		for (randomNumber = 0; randomNumber <= 100; randomNumber++) {
			randomNumber = (int) (Math.random() * 100 + 1);
			
		}
		
		//prompt the user to enter a value
		System.out.print("Enter a number in the range of 30-70: ");
		int value = input.nextInt();
		
		//create a loop to make sure the number is in the range
		while (value < 30 || value > 70) {
				System.out.print("The value is out of range, please reenter within the range of 30-70: ");
				value = input.nextInt();
				
				if (value >= 30 && value <= 70) {
					System.out.print("The value entered is " + value);
					
				}
		}
		if (randomNumber > value) {
			System.out.print("There are " + randomNumber + " random numbers larger than " + value);
		}
//		
//		
		
	}
		

}
