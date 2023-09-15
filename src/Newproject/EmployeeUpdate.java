package Newproject;
//Import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeUpdate {

    public static void main(String[] args) throws Exception {
        // Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database  parameters
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "LUCKY KUMAR777";

        // Establish a database connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Update an employee record
        PreparedStatement pst = con.prepareStatement("UPDATE employee_name SET ename=? WHERE eid=?");
        pst.setString(1, "Raju"); 
        pst.setInt(2, 6); 
        int i = pst.executeUpdate(); 
     // Print the number of rows updated
        System.out.println("No of rows updated: " + i); 

        // Delete an employee record
        PreparedStatement deletePst = con.prepareStatement("DELETE FROM employee_name WHERE eid = ?");
        deletePst.setInt(1, 3);
        int j = deletePst.executeUpdate();
     // Print the number of rows deleted
        System.out.println("No of rows deleted: " + j); 

        // display updated records
        ResultSet rset = pst.executeQuery("SELECT * FROM employee_name");
        while (rset.next()) {
            System.out.println(rset.getInt("eid") + " " + rset.getString("ename")+" "+rset.getString(3));
        }

        // Close database resources
        con.close();
        pst.close();
        rset.close();
    }
}
