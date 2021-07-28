import java.util.Scanner;

//Hisham Malik

public class ProjectileMotion {

	public static void main(String[] args) {
		
		// create scanner and prompt user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of the building: ");
		int heightOfBuilding = input.nextInt();
		
		System.out.print("Enter the speed of the ball: ");
		double initialSpeed = input.nextDouble();
		
		System.out.print("Enter the flight time of the ball: ");
		double flightTime = input.nextDouble();
		
		calcBallHeight(heightOfBuilding, initialSpeed, flightTime);
		
		input.close();
		
	}
	//method to calculate ball height
	public static double calcBallHeight(int heightOfBuilding, double initialSpeed, double flightTime) {
		
		//initialize the ball height variable
		double ballHeight = 0;
		//convert height of building to a double
		Double convertedHeight = Double.valueOf(heightOfBuilding);
		//calculate the ball height
		ballHeight = -16 * (flightTime) * (flightTime) + (initialSpeed) * (flightTime) + convertedHeight;
		
		System.out.printf("The ball will be %.2f feet above the ground after %.2f seconds of flight time", ballHeight, flightTime);
		
		return ballHeight;
		
		
	}
}
