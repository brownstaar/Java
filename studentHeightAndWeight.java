import java.util.Scanner;
public class studentHeightAndWeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] students = new String[2];
		double heightWeight[][] = new double [2][2];
		
		System.out.print("Enter first student's name: ");
		students[0] = input.nextLine();
		System.out.print("Enter the first students height(inches) and weight(lbs) seperated by a space: ");
		heightWeight[0][0] = input.nextDouble();
		heightWeight[0][1] = input.nextDouble();
		
		String clear = input.nextLine();
		
		System.out.print("Enter second student's name: ");
		students[1] = input.nextLine();
		System.out.print("Enter the second student's height(inches) and weight(lbs) seperated by a space: ");
		heightWeight[1][0] = input.nextDouble();
		heightWeight[1][1] = input.nextDouble();
		
		double totalWeight = calcWeight(heightWeight);
		
		System.out.printf("The two students weigh %4.2f lbs total.", totalWeight);
		
		

	}
	public static double calcWeight(double[][] list) {
		double total = list [0][1] + list [1][1];
		return total;
	}

}
