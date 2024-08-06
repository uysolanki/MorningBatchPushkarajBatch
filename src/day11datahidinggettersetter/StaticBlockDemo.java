package day11datahidinggettersetter;

public class StaticBlockDemo {
	static int strength;
	static String principalName;
	static
	{
		strength=10;
		principalName="Alice";
	}

	public static void main(String[] args) {
		display();
		System.out.println("ExcelR");
		display();
	}

	private static void display() {
		System.out.println("Edtech");
		
	}

}
