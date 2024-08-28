package day34.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateStaticDemo {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLDbConnection.getMySQLDbConnection();
		
		//String query="update jdbcemployee set salary=1000 where ename like 'Alice'";
		String query="update jdbcemployee set salary=3000,workmode='wfh' where ename like 'Alice'";
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " record Updated");
		
		st.close();
		con.close();

	}

}
