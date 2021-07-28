import java.util.Scanner;

//Hisham Malik
public class findingDistance {

	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		//creating the arrays
		String[] cities = new String[2];
		double[][] latLang = new double[2][2];
		
		
		//prompting the user to enter the first city with latitude and longitude
		System.out.print("Enter first city: ");
		cities[0] = input.nextLine();
		System.out.print("Enter Latitude and Longitude of the city: ");
		latLang[0][0] = input.nextDouble();
		latLang[0][1] = input.nextDouble();
		
		String clear = input.nextLine();
		
		
		//prompting the user to enter second city with it's Latitude and Longitude
		System.out.print("Enter second city: ");
		cities[1] = input.nextLine();
		System.out.print("Enter Latitude and Longitude of the city: ");
		latLang[1][0] = input.nextDouble();
		latLang[1][1] = input.nextDouble();
		
		input.close();
		
		double totalDistance = calcDistance(latLang);
		
		System.out.printf("The distance between the two cities is %.2f miles", totalDistance);
	}
	
	
	public static double calcDistance(double[][] latLang) {
		//calculating distance
		double xValue = (latLang[0][1] - latLang[1][1]) * 55;
    	double yValue = (latLang[0][0] - latLang[1][0]) * 69;
    	double distance = Math.sqrt(xValue * xValue + yValue * yValue);
    	
    	
    	return distance;
    	
    	
		}

		
}

