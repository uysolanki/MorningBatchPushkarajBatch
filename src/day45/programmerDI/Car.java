package day45.programmerDI;

public class Car {

	private String carMfgName;
	private double carPrice;
	private String carModelName;
	private String colour;

	private Engine e1;
	private Gear g1;

	public Car() {
	}

	public Car(String carMfgName, double carPrice, String carModelName, String colour, Engine e1, Gear g1) {
		this.carMfgName = carMfgName;
		this.carPrice = carPrice;
		this.carModelName = carModelName;
		this.colour = colour;
		this.e1 = e1;
		this.g1 = g1;
	}

	public String getCarMfgName() {
		return carMfgName;
	}

	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Engine getE1() {
		return e1;
	}

	public void setE1(Engine e1) {
		this.e1 = e1;
	}

	public Gear getG1() {
		return g1;
	}

	public void setG1(Gear g1) {
		this.g1 = g1;
	}

	@Override
	public String toString() {
		return "Car [carMfgName=" + carMfgName + ", carPrice=" + carPrice + ", carModelName=" + carModelName
				+ ", colour=" + colour + ", e1=" + e1 + ", g1=" + g1 + "]";
	}

}
