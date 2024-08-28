package day34.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDbConnection {

	public static Connection getMySQLDbConnection() throws Exception
	{
		String drivername="com.mysql.jdbc.Driver";
		String dburl="jdbc:mysql://localhost:3306/mb2db";
		String dbusername="root";
		String dbpassword="";
		
		Class.forName(drivername);  
	
		Connection con=DriverManager.getConnection(dburl,dbusername,dbpassword); 
		return con;
	}
}
