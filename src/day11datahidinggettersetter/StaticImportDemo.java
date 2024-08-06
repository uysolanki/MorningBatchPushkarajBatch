package day11datahidinggettersetter;
import static java.lang.Math.*;
public class StaticImportDemo {

	public static void main(String[] args) {
		System.out.println(ceil(3.2));
		
		System.out.println(floor(3.2));
		
		int Amritsar=300;
		int Jaipur=800;
		//System.out.println("Amritsar  to Jaipur : " + (Amritsar-Jaipur));
		System.out.println("Amritsar  to Jaipr : " + abs(Amritsar-Jaipur));
		
		System.out.println("Area of Circle radis 5 : "+ PI*5*5);

	}

}
