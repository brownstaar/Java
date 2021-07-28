
public class studentGrades {

	public static void main(String[] args) {
		
		//array with grades
		String[] students = new String[] { "Paul", "Tabatha", "Elaine" };
		int[][] grades = new int[][] {
			{ 65, 100, 82, 92, 77, 84 },
			{ 65, 82, 34, 55, 100, 65 },
			{ 85, 92, 95, 96, 100, 99 }
		};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(students[i] + ": ");
			
			//looping through columns
			int average = 0;
			for (int j = 0; j < grades[i].length; j++) {
				System.out.print(grades[i][j] + " ");
				average += grades[i][j];
			}
			average /= grades[i].length;
			System.out.println(". Average: " + average);
			
		}

	}

}
