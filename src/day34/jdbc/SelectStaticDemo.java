package day34.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStaticDemo {
public static void main(String[] args) throws Exception {
	Connection con=MySQLDbConnection.getMySQLDbConnection();
	
	String query="select salary,ename from jdbcemployee where gender like 'm'";
	
	Statement st=con.createStatement();
			 
	ResultSet rs= st.executeQuery(query);
	
	while(rs.next())
	{
		//System.out.println(rs.getString(1) + " " + rs.getInt(2));
		System.out.println(rs.getString("ename") + "$$" + rs.getInt("salary"));
	}
	
	rs.close();
	st.close();
	con.close();
	
}
}
