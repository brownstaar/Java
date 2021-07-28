package project3;

public class randomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 50;
		int max = 150;		
		int randomTemp = (int) (Math.random() * (max - min + 1) + min);
		
		System.out.print(randomTemp);

	}

}
