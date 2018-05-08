package program;

import java.util.Scanner;

import rides.AmusementRide;
import rides.BumperCars;
import rides.HauntedHouse;

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

		AmusementRide ar = new AmusementRide();
		// boolean keepGoing = true;
		while (true) {
			String option = input.nextLine();

			switch (option) {
			case "1":
				// BumperCars bumpy = new BumperCars();
				ar = new BumperCars();
				break;
			case "2":

				break;
			case "3":
				break;
			case "4":
				ar = new HauntedHouse();
				break;
			case "5":
				break;
			case "6":
				break;
			case "q":
				// keepGoing = false;
				System.out.println("Program ended.");
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;

			}
			ar.run();
			ar.sell();
		}

	}

}
