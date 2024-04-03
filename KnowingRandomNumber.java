package projects;
import java.util.Random;
import java.util.Scanner;

public class KnowingRandomNumber {

	
		public static void main(String[] args) {
		    Random random = new Random();
		    Scanner sc = new Scanner(System.in);

		    do {
		        int targetNumber = random.nextInt(100);
		        int remainingAttempts = 5;
		        System.out.println("Guess a number between 0 and 100");

		        while (remainingAttempts > 0) {
		            System.out.println("Remaining attempts: " + remainingAttempts);
		            int guess = sc.nextInt();
		            if (guess == targetNumber) {
		                System.out.println("Congratulations, you guessed it!");
		                break;
		            } else if (guess > targetNumber) {
		                System.out.println("Enter a smaller number.");
		            } else {
		                System.out.println("Enter a larger number.");
		            }

		            remainingAttempts--;
		        }

		        if (remainingAttempts == 0) {
		            System.out.println("Sorry, you couldn't guess the correct number. The correct number was " + targetNumber);
		        }

		        System.out.println("Do you want to play again? Yes/No");
		        String continuePlaying = sc.next();
		        if (!continuePlaying.equalsIgnoreCase("Yes")) {
		            System.out.println("Game over");
		            break;
		        }
		    } while (true);
		

		
	}

}
