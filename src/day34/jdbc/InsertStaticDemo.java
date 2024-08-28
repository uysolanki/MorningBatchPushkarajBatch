package day34.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStaticDemo {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLDbConnection.getMySQLDbConnection();
		
		String query="insert into jdbcemployee values(3,'Chris','m',33,'C123456','wfo',900)";
		
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " record Inserted");
		
		st.close();
		con.close();
	}

}
