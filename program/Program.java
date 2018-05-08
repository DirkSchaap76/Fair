package program;

import java.util.Scanner;
import rides.BumperCars;

public class Program {

	public static void main(String[] args) {

		System.out.println("Main menu.");
		System.out.println("Press 1 for Bumper Cars.");
		System.out.println("Press 2 for Jump and Smile.");
		System.out.println("Press 3 for Mirror Maze.");
		System.out.println("Press 4 fot Haunted House.");
		System.out.println("Press 5 for Top Spin.");
		System.out.println("Press 6 for Tornado.");
		System.out.println("Press q to quit.");

		Scanner input = new Scanner(System.in);

		while (true) {
			String option = input.nextLine();

			switch (option) {
			case "1":
				BumperCars bumpy = new BumperCars();
				bumpy.run();
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "q":
				System.exit(0);

				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;

			}
		}

		input.close();
		System.out.println("Program ended.");

	}

}
