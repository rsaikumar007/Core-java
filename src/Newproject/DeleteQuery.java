package Newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {

	public static void main(String[] args) throws  SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/STUDENT";
		String user="root";
		String password="LUCKY KUMAR777";
		
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pst=con.prepareStatement("delete from employee_name where eid=5");
        int i=pst.executeUpdate();
        System.out.println("No of rows effected:"+i);
        con.close();
        pst.close();
	}

}
