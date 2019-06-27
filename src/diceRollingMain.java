import java.util.Random;
import java.util.Scanner;

public class diceRollingMain {

	public static void main(String[] args) {
		
		int rollNumber = 1;
		String rollAgain = " ";
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			System.out.print("\nHow many sides should each die have? ");
				Scanner scnr = new Scanner(System.in);
				int numberOfSidesOnDie = scnr.nextInt();
		
			System.out.println("\nRoll " + rollNumber + ": ");
				rollNumber++;
		
			int firstDieRollResult = generateRandomDieRoll(numberOfSidesOnDie);
			int secondDieRollResult = generateRandomDieRoll(numberOfSidesOnDie);
		
		
			System.out.println(firstDieRollResult);
			System.out.println(secondDieRollResult);
		
			boxCars(firstDieRollResult, secondDieRollResult);
			snakeEyes(firstDieRollResult, secondDieRollResult);
			craps(firstDieRollResult, secondDieRollResult);
		
			System.out.print("\nRoll again? (y/n): ");
				rollAgain = scnr.next();
				rollAgain = rollAgain.toLowerCase();
		
		} while (rollAgain.contentEquals("y")); 
		
		System.out.println("\nThank you for playing.");
	
			
	}
	
			//int firstDieRollResult = (int) ((Math.random()) * numberOfSidesOnDie) + 1;
			//int secondDieRollResult = (int) ((Math.random()) * numberOfSidesOnDie) + 1;
	
	public static int generateRandomDieRoll(int numSides) {
		Random random = new Random();
		int dieRollResult = random.nextInt(numSides) + 1;
		return dieRollResult;
	}
	
	public static void boxCars(int a, int b) {
		if ((a == 6) && (b == 6)) {
			System.out.println("Box Cars!");
		}
	}
	
	public static void snakeEyes(int a, int b) {
		if ((a == 1) && (b == 1)) {
			System.out.println("Snake Eyes!");
		}
	}
	
	public static void craps(int a, int b) {
		if (((a + b) == 2) || ((a + b) == 3) || ((a + b) == 12)) {
			System.out.println("Craps!");	
		}
	}
	
	
	
	
}
