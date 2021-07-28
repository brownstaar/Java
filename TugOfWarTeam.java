import java.util.Scanner;
public class TugOfWarTeam {

	public static void main(String[] args) {
		
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// store each user input into string
		String keyboard = null;
		
		// prompt the user to enter information
		System.out.print("Enter team name: ");
		String team = input.nextLine();
		
		System.out.print("Enter first member of team " + team + "'s name: ");
		String member1 = input.nextLine();
		
		System.out.print("Enter " + member1 + "'s weight in lbs: ");
		keyboard = input.nextLine();
		double weight1 = Double.parseDouble(keyboard);
		
		System.out.print("Enter second member of team " + team + "'s name: ");
		String member2 = input.nextLine();
		
		System.out.print("Enter " + member2 + "'s weight in lbs: ");
		keyboard = input.nextLine();
		double weight2 = Double.parseDouble(keyboard);
		
		System.out.print("Enter third member of team " + team + "'s name: ");
		String member3 = input.nextLine();
		
		System.out.print("Enter " + member3 + "'s weight in lbs: ");
		keyboard = input.nextLine();
		double weight3 = Double.parseDouble(keyboard);
		
		// computer weight and determine if the team qualifies
		double kilograms = (weight1 + weight2 + weight3) / 2.2046;
		
		// if and then statement to determine if the team is qualified and display team name and members
		double allowedWeight = 272.16;
		
		System.out.println("Team " + team + " 's members are: " + member1 + ", " + member2 + ", " + member3 + ", ");
		
		if (kilograms < allowedWeight) {
			System.out.printf("The total weight of team %s is %.2f and is under %f", team, kilograms, allowedWeight);
		} else {
			System.out.printf("The total weight of team %s is %.2f and exceeds %.2f", team, kilograms, allowedWeight);
		}
		
		input.close();
		
		
	}

}
