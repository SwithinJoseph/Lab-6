
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int diceSides;
		int die1;
		int die2;
		String cont = "";

		do {
			System.out.print("How many sides do your dice have? ");
			diceSides = scnr.nextInt();

			do {
				die1 = generateRandomDieRoll(diceSides);
				die2 = generateRandomDieRoll(diceSides);

				System.out.printf("%15d %d", die1, die2);
				System.out.print("\nDo you want to roll again? (y/n) ");
				cont = scnr.next();

			} while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y"));

			System.out.println();
			System.out.println("Do you want to roll different dice? (y/n)");
			cont = scnr.next();
			
		} while (cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y"));

		System.out.printf("%20s", "Goodbye!");

	}

	public static int generateRandomDieRoll(int sides) {
		return (int) (sides * Math.random() + 1);
	}

}
