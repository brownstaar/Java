//Hisham Malik
public class bubbleSort {

	public static void main(String[] args) {
		//declaring array
		int[] numbers = new int[10];
		//initializing array to random digits
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100 + 1);
			System.out.print(numbers[i] + " ");
			
		}
		
		
		//display the largest element
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		System.out.println("\n The largest element is: " + max);
		bubbleClass(numbers);
	}
	
	
	//bubblesort the array
	public static void bubbleClass(int[] numbers) {
	    int temp = 0;
	    			  
		  for (int i = numbers.length - 1; i > 0; i--) {
			  
	         for (int j = 0; j < i; j++) {
	        	 
	           if (numbers[j] > numbers[j + 1]) {
	        	   
	           temp = numbers[j];
	           numbers[j] = numbers[j + 1];
	           numbers[j + 1] = temp;
	           
	           System.out.println(numbers + " ");
	           }
	           
	         }
	      }
		  
	   }

	
	
}