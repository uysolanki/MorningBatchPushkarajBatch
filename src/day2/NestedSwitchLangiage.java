package day2;

import java.util.Scanner;

public class NestedSwitchLangiage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Main Menu***");
		System.out.println("1. English");
		System.out.println("2. Arabic");
		
		System.out.println("Please select Language : ");
		int lang=sc.nextInt();
		int accent;
		
		switch(lang)
		{
		case 1:	System.out.println("***English Accent Menu***");
				System.out.println("1. US");
				System.out.println("2. UK");
				System.out.println("3. Aus");
				System.out.println("Please select Accent : ");
				accent=sc.nextInt();
				
				switch(accent)
				{
				case 1 : System.out.println("Call routed to New York ");
				break;
				case 2 : System.out.println("Call routed to London ");
				break;
				case 3 : System.out.println("Call routed to Sydney ");
				break;
				default : System.out.println("Invalid choice");
				}
			System.out.println("Thank You");	
		
		break;
		case 2:
			System.out.println("***Arabic Accent Menu***");
			System.out.println("1. Kuwait");
			System.out.println("2. Qatar");
			System.out.println("3. Dubai");
			System.out.println("Please select Accent : ");
			accent=sc.nextInt();
			
			switch(accent)
			{
			case 1 : System.out.println("Call routed to Kuwait ");
			break;
			case 2 : System.out.println("Call routed to Doha ");
			break;
			case 3 : System.out.println("Call routed to Abu Dhabi ");
			break;
			default : System.out.println("Invalid choice");
			}
			
			System.out.println("Shukran");
		break;
		default : System.out.println("Invalid choice");
			
		}
	

	}

}
