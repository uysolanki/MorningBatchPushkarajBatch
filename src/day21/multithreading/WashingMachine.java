package day21.multithreading;

public class WashingMachine {

	public static void main(String[] args) throws InterruptedException {
		Soak t1=new Soak();
		Wash t2=new Wash();
		Dry t3=new Dry();
		
		t1.start();					//1				Soak 1
		//t1.join(3000,100);				//2 			Soak 2
		t2.start();					//3				Soak 3	
		t2.join(3000,100);				//4             Soak 4			Wash 1
		t3.start();					//5             Soak 5			Wash 2
									//6								Wash 3
	}								//7								Wash 4    Dry 1
									//8								Wash 5    Dry 2
}									//9                						  Dry 3 4 5 
