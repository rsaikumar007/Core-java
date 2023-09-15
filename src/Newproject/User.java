package Newproject;
 //import packages
import java.sql.*;
import java.util.Scanner;

class User {
    public static void main(String[] args) throws Exception {
        // Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Define the database parameters
        String url = "jdbc:mysql://localhost:3306/STUDENT";
        String user = "root";
        String password = "LUCKY KUMAR777";
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Create a PreparedStatement for inserting records into the "employee_name" table
        PreparedStatement ps = con.prepareStatement("insert into employee_name values(?,?,?)");

        // Create a Scanner 
        Scanner sc = new Scanner(System.in);

        // Start a loop for entering employee records
        while (true) {
            System.out.println("Enter eid:");
            int eid = sc.nextInt();
            System.out.println("Enter ename:");
            String ename = sc.next();
            System.out.println("Enter esalary:");
            String esalary = sc.next();

            // Set the parameters for the PreparedStatement
            ps.setInt(1, eid);
            ps.setString(2, ename);
            ps.setString(3, esalary);

            // Execute the number of records affected
            int i = ps.executeUpdate();
            System.out.println("No of records affected: " + i);

            System.out.println("Do you want to continue (y/n):");
            String s = sc.next();
            if (s.equals("n")) {
                break;
            }
        }

        // Close the connections and statements
        con.close();
        ps.close();
    }
}
