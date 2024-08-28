package day34.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicDemo {

	public static void main(String[] args) throws Exception 
	{
	//3,'Chris','m',33,'C123456','wfo',900	
	Connection con=MySQLDbConnection.getMySQLDbConnection();
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter eno ");
//	int rno=sc.nextInt();
	System.out.println("Enter ename ");
	String ename=sc.next();
	System.out.println("Enter gender [m/f] ");
	String gender=sc.next();
	System.out.println("Enter Age ");
	int age=sc.nextInt();
	System.out.println("Enter Passport NO ");
	String passport=sc.next();
//	System.out.println("Enter Workmode ");
//	String workmode=sc.next();
	System.out.println("Enter Salary ");
	int salary=sc.nextInt();
	
//	String query="insert into jdbcemployee values(?,?,?,?,?,?,?)";
//	PreparedStatement ps=con.prepareStatement(query);
//	ps.setInt(1, a);
//	ps.setString(2, b);
//	ps.setString(3, c);
//	ps.setInt(4, d);
//	ps.setString(5, e);
//	ps.setString(6, f);
//	ps.setInt(7, g);
//	
//	int rows=ps.executeUpdate();
//	System.out.println(rows + " record Inserted");
//	
//	ps.close();
//	con.close();
	
	
	String query="insert into jdbcemployee(ename,gender,age,passport,salary) values(?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, ename);
	ps.setString(2, gender);
	ps.setInt(3, age);
	ps.setString(4, passport);
	ps.setInt(5, salary);
	
	int rows=ps.executeUpdate();
	System.out.println(rows + " record Inserted");
	
	ps.close();
	con.close();

	}

}
