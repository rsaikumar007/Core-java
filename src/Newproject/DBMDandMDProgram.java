package Newproject;
//import packaages

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBMDandMDProgram {

    public static void main(String[] args) {
    	
    	//load the drivers
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "LUCKY KUMAR777";

        try {
            // Connect to the database using Drivermanager
            Connection con = DriverManager.getConnection(url, user, password);

            // Get and display database metadata
            DatabaseMetaData dbmd = con.getMetaData();
            //print the Database and drivers
            System.out.println("DataBase And Driver Details:---------->");
            
            System.out.println("Database major version: " + dbmd.getDatabaseMajorVersion());
            
            System.out.println("Driver Name: " + dbmd.getDriverName());
            
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            
            System.out.println("Product Name: " + dbmd.getDatabaseProductName());
            
            System.out.println("Product Version: " + dbmd.getDatabaseProductVersion());
            
            System.out.println("URL: " + dbmd.getURL());
            
            System.out.println("User Name: " + dbmd.getUserName());
            
            System.out.println("Max TableName Length: " + dbmd.getMaxTableNameLength());
            
            System.out.println("Time Date Functions: " + dbmd.getTimeDateFunctions());

            // Get and display table metadata
            Statement st = con.createStatement();
            ResultSet rset = st.executeQuery("SELECT * FROM employee_name");
            ResultSetMetaData rsmd = rset.getMetaData();
            // print the Table details
            System.out.println("Table Details:------------->");
            
            System.out.println("Table Name: " + rsmd.getTableName(1));
            
            System.out.println("No of columns: " + rsmd.getColumnCount());
            
            System.out.println("Column typename: " + rsmd.getColumnTypeName(1));
            
            System.out.println("Column classname: " + rsmd.getColumnClassName(1));
            
            System.out.println("Display Size: " + rsmd.getColumnDisplaySize(1));
            
            System.out.println("Column Name: " + rsmd.getColumnName(1));
            
            System.out.println("Column Type: " + rsmd.getColumnType(1));

            // Close the database connection
            con.close();
            rset.close();
            st.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
