package rides;

public class BumperCars extends AmusementRide {

	private String name;
	private double price = 2.5;
	private int timesRun;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTimesRun() {
		return timesRun;
	}

	public void setTimesRun(int timesRun) {
		this.timesRun = timesRun;
	}

	@Override
	public void run() {
		System.out.println("Bumper Cars. Ride is run!");

	}

	@Override
	public void sell() {
		System.out.println("Bumper Cars. Sale is made.");

	}

}
