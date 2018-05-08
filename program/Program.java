package program;

import java.util.Scanner;

import rides.AmusementRide;
import rides.BumperCars;
import rides.HauntedHouse;
import rides.JumpAndSmile;
import rides.MirrorMaze;
import rides.TopSpin;
import rides.Tornado;

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

		while (true) {
			String option = input.nextLine();

			switch (option) {
			case "1":

				ar = new BumperCars();
				break;
			case "2":
				ar = new JumpAndSmile();
				break;
			case "3":
				ar = new MirrorMaze();
				break;
			case "4":
				ar = new HauntedHouse();
				break;
			case "5":
				ar = new TopSpin();
				break;
			case "6":
				ar = new Tornado();
				break;
			case "q":

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
