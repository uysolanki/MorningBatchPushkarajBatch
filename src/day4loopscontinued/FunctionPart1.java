package day4loopscontinued;

public class FunctionPart1 {
public static void main(String[] args) {
	System.out.println("I am in Main");     //1
	brazil();      //main wakes up
	System.out.println("I am finally back in Main"); //5
}

private static void brazil() {
	System.out.println("I am in Brazil");   //2 
	argentina();    //brazil wakes up
	System.out.println("I am back in Brazil"); //4
}

private static void argentina() {
	System.out.println("I am in Argentina");  //3
}
}
