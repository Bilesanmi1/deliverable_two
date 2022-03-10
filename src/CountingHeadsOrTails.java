
import java.security.SecureRandom;

import java.util.Scanner;

public class CountingHeadsOrTails {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);// Scanner object for user input
		//declare variables
		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount = 0;
		String flips;//string variable to hold flip result
		
		System.out.print("Guess which will have more: heads or tails? ");
		headsOrTailsGuess = input.nextLine();
		System.out.println("How many times will we flip a coin? ");
		numberOfFlips = input.nextInt();
		//loop to flip coin based on user entry
		for(int i = 0; i < numberOfFlips; i++) {
			flips = flip();
			System.out.println(flips);
			if(headsOrTailsGuess.equals(flips)) {
				correctCount += 1;
			}
		}
		//calculation for percentage 
				int percentage = (correctCount) *100 / (numberOfFlips);
				
		//results
		System.out.printf("Your guess %s came up %d time(s).\nThat's %d%%.", headsOrTailsGuess, correctCount, percentage);
		
	
		
		
		
		
	}
	public static String flip(){//method to simulate coin flip
        String heads = "heads";
        String tails = "tails";
        SecureRandom randInt = new SecureRandom();
        int num = 1 + randInt.nextInt(10);//generate number between 1 and 10
        if(num <= 5){ //determine  heads or tails
            return heads;
        }else{
            return tails;
        }

} 
	}
