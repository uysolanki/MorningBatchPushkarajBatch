package day10classobject;

public class PlayerApp {

	public static void main(String[] args) {
	Player p1=new Player();  //1  Virat mp 1  ip 1 rs 1 no 1
	Player p2=new Player();  //1  Virat mp 1  ip 1 rs 1 no 1
	Player p3=new Player();  //1  Virat mp 1  ip 1 rs 1 no 1
	Player p4=new Player(63,"Hardik",100,90,10,1000);
	Player p5=new Player(99,"Surya",200,150,50,5000);
	                    //int, String,int , int, int ,int
	Player p6=new Player(p4);
	p1.displayPlayer();  
	p2.displayPlayer(); 
	p3.displayPlayer(); 
	p4.displayPlayer();
	p5.displayPlayer();
	p6.displayPlayer();
	}

	
	
}
