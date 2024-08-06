package day16solid.srpproblem;

public class DriverApp {

	public static void main(String[] args) {
		StringManipulatorDisplayer smd=new StringManipulatorDisplayer("Mahendra Singh Dhoni");
		smd.displayName();
		//smd.getSubString();
		//smd.displayName();
		smd.modifyString("Kumar","Singh");
		smd.displayName();
	}

}
