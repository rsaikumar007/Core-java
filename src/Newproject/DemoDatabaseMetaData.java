package Newproject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoDatabaseMetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String password="LUCKY KUMAR777";
		Connection con=DriverManager.getConnection(url, user, password);
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("Database major version:"+dbmd.getDatabaseMajorVersion());
		System.out.println("Driver Name:"+dbmd.getDriverName());
		System.out.println("Driver Version:"+dbmd.getDriverVersion());
		System.out.println("Product Name:"+dbmd.getDatabaseProductName());
		System.out.println("Product Version:"+dbmd.getDatabaseProductVersion());
		
		System.out.println(dbmd.getTableTypes());
		System.out.println(dbmd.getURL());
		System.out.println(dbmd.getUserName());
		System.out.println(dbmd.getMaxTableNameLength());
		System.out.println(dbmd.getTimeDateFunctions());

	}

}
