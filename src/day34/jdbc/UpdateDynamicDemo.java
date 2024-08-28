package day34.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDynamicDemo {

	public static void main(String[] args) throws Exception {
		Connection con=MySQLDbConnection.getMySQLDbConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno ");
		int eno=sc.nextInt();
		
		System.out.println("Enter new workmode ");
		String workmode=sc.next();
		
		System.out.println("Enter new salary ");
		int salary=sc.nextInt();
		
		String query="update jdbcemployee  set workmode=?, salary=? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, workmode);
		ps.setInt(2, salary);
		ps.setInt(3, eno);
		
		int rows=ps.executeUpdate();
		System.out.println(rows + " rows Updated");

	}

}
