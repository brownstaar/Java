import java.util.Scanner;
public class ConvertKiloToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter kilometers: ");
		
		Double kilometers = input.nextDouble();
		
		double miles = kilometers / 1.6;
		
		System.out.println(miles);
				
				

	}

}
