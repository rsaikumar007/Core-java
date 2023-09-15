package Newproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertmysql {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/STUDENT";
		String user="root";
		String password="LUCKY KUMAR777";
		
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pst=con.prepareStatement("insert into employee_name values(?,?,?)");
        pst.setInt(1, 5);
        pst.setString(2, "Suresh");
        pst.setString(3, "15000");
		int i=pst.executeUpdate();
		
		pst.setInt(1, 6);
        pst.setString(2, "Ramesh");
        pst.setString(3,"10000");
        i+=pst.executeUpdate();
		System.out.println("No.of Rows inserted:"+i);
		con.close();
		pst.close();
	}

}
