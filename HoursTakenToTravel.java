package java_project;
import java.util.Scanner;

public class HoursTakenToTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// setting up an instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		// get the speed from the user and store it into a variable
		System.out.print("Enter the speed you will be traveling at: ");
		int mph = input.nextInt();
		
		// get the distance from the user and store it into a variable
		System.out.print("Enter the distance you want to travel for example 5.2: ");
		double distance = input.nextDouble();
		
		// calculating the time it will take to travel the distance
		double time = distance / mph;
		
		System.out.println("The trip will take the following number of hours " + time);

	}

}
