package day45.programmerDI;

public class DIMain {

	public static void main(String[] args) {
	Engine engine1=new Engine(25, "Petrol", 2500);
	Engine engine2=new Engine(15, "Diesel", 1500);
	Engine engine3=new Engine(10, "Hybrid", 1000);
	
	Gear gear1=new Gear(6, "Byd", "Manual");
	Gear gear2=new Gear(4, "Honda", "Automatic");
	Gear gear3=new Gear(2, "Tata", "Automatic");
	
	Car myCar1=new Car("Toyota", 1000, "Innova", "White", engine1, gear1);  //CDI
	Car myCar2=new Car("Honda", 700, "City", "Grey", engine2, gear2);       //CDI
	
	Car myCar3=new Car();
	myCar3.setCarMfgName("Tata");
	myCar3.setCarPrice(500);
	myCar3.setCarModelName("Nano");
	myCar3.setColour("Red");
	myCar3.setE1(engine3);													//SDI
	myCar3.setG1(gear3);													//SDI
	
	
	System.out.println(myCar1);
	System.out.println(myCar2);
	System.out.println(myCar3);
	}

}
