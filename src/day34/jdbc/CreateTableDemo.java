package day34.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  //older verion driver
		//Class.forName("com.mysql.cj.jdbc.Driver"); //new version
		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mb2db","root","");  
		
		String query="create table jdbcemployee(\r\n"
				+ "eno int(5) primary key auto_increment,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "gender varchar(1) not null check(gender in('m','f')),\r\n"
				+ "age int(3) not null check(age>=18),\r\n"
				+ "passport varchar(10) unique,\r\n"
				+ "workmode varchar(10) default 'wfo',\r\n"
				+ "salary int(5) check(salary>0))";
		Statement st=con.createStatement();
		st.execute(query);
		System.out.println("Table Created");
		
		st.close();
		con.close();
		
		//Rohan Thorat FH
		//Parth Recursive
		//Omkar Kurkute Methods Of Collection interface
	}

}
