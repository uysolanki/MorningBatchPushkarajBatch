package day34.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo2 {

	public static void main(String[] args) throws Exception {
		Connection con=MySQLDbConnection.getMySQLDbConnection();
		
		String query="select workmode,count(*) from jdbcemployee group by workmode";
		
		Statement st=con.createStatement();
				 
		ResultSet rs= st.executeQuery(query);
		
		System.out.println(String.format("%-12s","Workmode") + String.format("%-15s", "Employees"));
		while(rs.next())
		{
		System.out.println(String.format("%-12s",rs.getString(1)) + String.format("%-15d", rs.getInt(2)));
		}
		rs.close();
		st.close();
		con.close();
	}

}
