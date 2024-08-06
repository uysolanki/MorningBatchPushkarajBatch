package day15turf;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String customerName = sc.next();
		System.out.println("Enter Mobile Number");
		long customerMobileNo = sc.nextLong();

		System.out.println("****Turf Options****");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("4. Skating");
		System.out.println("0. Exit");

		int turfChoice = sc.nextInt();
		Turf t = null;
		double turfPrice=0;
		String turfType=null;
		String companyName=null;
		switch (turfChoice) {
		case 1:
			t = new CricketTurf();
			turfPrice = t.getTurfPrice();
			turfType=t.getTurfName();
			break;
		case 2:
			t = new FootballTurf();
			turfPrice = t.getTurfPrice();
			turfType=t.getTurfName();
			break;
		case 3:
			t = new TennisTurf();
			turfPrice = t.getTurfPrice();
			turfType=t.getTurfName();
			break;
		case 4:
			t = new SkatingTurf();
			turfPrice = t.getTurfPrice();
			turfType=t.getTurfName();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Please enter valid input");
		}
		System.out.println("Company Name " +t.companyName());
		System.out.println("Customer Name " + customerName);
		System.out.println("Customer Mobile  " + customerMobileNo);
		System.out.println("Court type :"+ turfType);
		System.out.println("Court price : " + turfPrice);
		System.out.println("Thank You!!!");
	}

}
