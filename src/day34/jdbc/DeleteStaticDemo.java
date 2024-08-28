package day34.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteStaticDemo {
public static void main(String[] args) throws Exception
{
	Connection con=MySQLDbConnection.getMySQLDbConnection(); //connect to the db
	
	String query="delete from product where pro_id=1";
	
	Statement st=con.createStatement();
	
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + " record Deleted");
	
	st.close();
	con.close();
}
}
