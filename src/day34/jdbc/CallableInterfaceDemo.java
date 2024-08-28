package day34.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class CallableInterfaceDemo {

	public static void main(String[] args) throws Exception {
		Connection con=MySQLDbConnection.getMySQLDbConnection();
		
		//call emppro3(9,'John',29,'m',1900,'wfh','JO1234');
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno ");
		int eno=sc.nextInt();
		System.out.println("Enter ename ");
		String ename=sc.next();
		System.out.println("Enter gender [m/f] ");
		String gender=sc.next();
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		System.out.println("Enter Passport NO ");
		String passport=sc.next();
		System.out.println("Enter Workmode ");
		String workmode=sc.next();
		System.out.println("Enter Salary ");
		int salary=sc.nextInt();
		
		//call emppro3(9,'John',29,'m',1900,'wfh','JO1234');
		String query="{call emppro3(?,?,?,?,?,?,?,   ?)}"; //8 para
		CallableStatement cs=con.prepareCall(query);
		cs.setInt(1,eno);
		cs.setString(2, ename);
		cs.setInt(3,age);
		cs.setString(4, gender);
		cs.setInt(5,salary);
		cs.setString(6, workmode);
		cs.setString(7, passport);
		cs.registerOutParameter(8, java.sql.Types.VARCHAR);
		cs.executeUpdate();
		
		String result=cs.getString(8);
		if(result.equals("inserted"))
		{
			System.out.println("Record Inserted");
		}
		else
		{
			System.out.println("Record Not Inserted");
		}
		
		cs.close();
		con.close();
	}

}
