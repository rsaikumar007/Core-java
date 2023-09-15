package Newproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Employeedetails {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement st=null;
		ResultSet rset=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/STUDENT";
			String user="root";
			String password="LUCKY KUMAR777";
			con=DriverManager.getConnection(url,user,password);
			st=con.createStatement();
			rset=st.executeQuery("select * from employee_name");
			while(rset.next())
				System.out.println(rset.getInt("eid")+" "+rset.getString("ename")+" "+rset.getString("esalary"));
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			con.close();
			st.close();
			rset.close();
		}

	}

}
