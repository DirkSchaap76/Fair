package rides;

public class BumperCars extends AmusementRide {
	private static int counter = 0;

	public final static double price = 2.50;

	public BumperCars() {

		this.name = "BumperCars";

		counter++;

	}

	public static int getCounter() {

		return counter;

	}

	@Override

	public void sell() {

		System.out.println("BumperCars: a sale is made.");

	}

	@Override

	public void run() {

		System.out.println("BumperCars: ride is run.");

	}

	@Override

	public String toString() {

		return "name of ride:" + this.name + "\tPrice of the ride:" + BumperCars.price;

	}
}
