package program;

import java.util.Scanner;

import rides.AmusementRide;
import rides.BumperCars;
import rides.CashDesk;
import rides.HauntedHouse;
import rides.JumpAndSmile;
import rides.MirrorMaze;
import rides.TopSpin;
import rides.Tornado;

public class Program {

	public static void main(String[] args) {

		menu();
		String input = "";
		CashDesk cd = null;
		Scanner scan = new Scanner(System.in);
		AmusementRide game = null;

		while (true) {
			String option = scan.nextLine();

			switch (option) {
			case "1":
				game = new BumperCars();
				game.run();
				break;
			case "2":
				game = new JumpAndSmile();
				game.run();
				break;
			case "3":
				game = new MirrorMaze();
				game.run();
				break;
			case "4":
				game = new HauntedHouse();
				game.run();
				break;
			case "5":
				game = new TopSpin();
				game.run();
				break;
			case "6":
				game = new Tornado();
				game.run();
				break;
			case "r":
				cd = new CashDesk();
				System.out.println(cd.getRevenue());
				break;
			case "t":
				cd = new CashDesk();
				System.out.println(cd.getCountOfTickets());
				break;
			case "q":

				System.out.println("Program ended.");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;

			}

		}

	}

	public static void menu() {

		System.out.println("1-BumperCars\n2-JumpAndSmile \n3-MirrorMaze " + "\n4-HauntedHouse \n5-TopSpin"
				+ " \n6-Tornado \n7-press 'r' to show the revenue\n"
				+ "8-press 't' to show the total soled tickets\n9-press 'm' to show menu\n10-Press 'q' for exit");

	}

}
