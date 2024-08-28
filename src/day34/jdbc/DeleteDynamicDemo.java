package day34.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDynamicDemo {

	public static void main(String[] args) throws Exception {
	Connection con=MySQLDbConnection.getMySQLDbConnection();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno ");
	int eno=sc.nextInt();
	
	String query="delete from jdbcemployee where eno=?";
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, eno);
	
	int rows=ps.executeUpdate();
	System.out.println(rows + " rows Deleted");
	

	}

}
