package day34.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDynamicUsingStatement {
public static void main(String[] args) throws Exception {
	
	Connection con=MySQLDbConnection.getMySQLDbConnection();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno ");
	int eno=sc.nextInt();
	
	System.out.println("Enter new workmode ");
	String workmode=sc.next();
	
	System.out.println("Enter new salary ");
	int salary=sc.nextInt();
	
	String query="update jdbcemployee  set workmode='"+workmode+"',"+"salary="+salary+" where eno="+eno;
	String query1="select * from emp";
	Statement st=con.createStatement();
	
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + " record Inserted");
	
	st.close();
	con.close();
}
}
