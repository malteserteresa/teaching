package work;
public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Can you explain to me (in terms of data transformations) what's happening here?
		 */

		for (int i = 1; i <= 100; i++) {
			String word = "";
			if(i % 3 == 0) { word = "Fizz";};
			if(i % 5 == 0) { word = "Buzz";};
			if(i % 3 == 0 && i % 5 == 0) { word = "FizzBuzz";};
			
			
			switch (word){
			case "Fizz": 
				System.out.println("Fizz");
				break;
			
			case "Buzz" : 
				System.out.println("Buzz");
				break;
			
			case "FizzBuss": 
				System.out.println("FizzBuzz");
				break;
				}
		}
	}
}
