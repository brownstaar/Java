package casestudy3;
import java.util.Scanner;


public class BodyMassIndex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt the user for body weight
		System.out.print("Enter your weight in pounds: ");
		int weight = input.nextInt();
		
		//prompt the user for height in inches
		System.out.print("Enter your height in inches: ");
		int height = input.nextInt();
		
		// declaring constants
		final double kilograms = 0.45359237;
		final double meters = 0.0254;
		
		// calculating BMI
		double weightInKilograms = weight * kilograms;
		double heightInMeters = height * meters;
		double bmi =  weightInKilograms / (heightInMeters * heightInMeters);
		
		// System.out.print(bmi);
		
		// display result
		
//		if (bmi < 18.5)
//			System.out.print("You are underweight");
//		else if (bmi < 25)
//			System.out.print("Your weight is normal");
//		else if (bmi < 30)
//			System.out.print("You're overweight");
//		else 
//			System.out.print("You are obese");
		
		switch (bmi) {
		case bmi < 18.5:
			System.out.print("You are underweight");
		break;
		}

	}

}
