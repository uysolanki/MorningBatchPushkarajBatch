package day10classobject;

import java.util.Scanner;

public class Player {

	private int jno;
	private String pname;
	private int mp;
	private int ip;
	private int no;
	private int rs;
	
	public Player()  //NoArgsConstructor
	{
		this.jno=1;
		this.pname="Virat";
		this.mp=1;
		this.ip=1;
		this.no=1;
		this.rs=1;
	}
	
	public Player(int a, String b,int c, int d, int e ,int f)  //Parameterised Constructor
	{
		this.jno=a;
		this.pname=b;
		this.mp=c;
		this.ip=d;
		this.no=e;
		this.rs=f;
	}
	
	public Player(Player temp)   //copy constructor
	{
		this.jno=temp.jno;
		this.pname=temp.pname;
		this.mp=temp.mp;
		this.ip=temp.ip;
		this.no=temp.no;
		this.rs=temp.rs;
	}
	public void acceptPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jno");
		jno=sc.nextInt();
		System.out.println("Enter p name");
		pname=sc.next();
		System.out.println("Enter mp");
		mp=sc.nextInt();
		System.out.println("Enter ip");
		ip=sc.nextInt();
		System.out.println("Enter no");
		no=sc.nextInt();
		System.out.println("Enter rs");
		rs=sc.nextInt();
	}
	public void displayPlayer()
	{
		
		System.out.println("jno is "+jno);
		System.out.println("p nameo is "+pname);
		System.out.println("matches played is "+mp);
		System.out.println("innings player is "+ip);
		System.out.println("Not out "+no);
		System.out.println("runs scored is "+rs);
	}
}
