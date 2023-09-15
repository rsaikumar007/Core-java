package Newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DemoMetaData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String passwword="LUCKY KUMAR777";
		Connection con=DriverManager.getConnection(url, user, passwword);
		Statement st=con.createStatement();
		ResultSet rset=st.executeQuery("select* from employee_name");
		ResultSetMetaData rsmd=rset.getMetaData();
		System.out.println("Table Name:"+rsmd.getTableName(1));
		System.out.println("No of columns:"+rsmd.getColumnCount());
		System.out.println("Column typename:"+rsmd.getColumnTypeName(1));
		System.out.println("Column classname"+rsmd.getColumnClassName(1));
		System.out.println("Display Size:"+rsmd.getColumnDisplaySize(1));
		System.out.println("Column Name:"+rsmd.getColumnName(1));
		System.out.println("Column Type:"+rsmd.getColumnType(1));
		
	}


}
