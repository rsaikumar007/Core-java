package Newproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BatchDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String password="LUCKY KUMAR777";
		
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pst=con.prepareStatement("select* from employee_name");
        ResultSet rst=pst.executeQuery();
        while(rst.next())
        	System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getString(3));
        	pst.addBatch("insert into employee_name values(7,'Sazid','20000')");
        	pst.addBatch("update employee_name set ename='Raj' where eid=2");
        	int[]i=pst.executeBatch();
        	System.out.println("No of Records inserted:"+i.length);
       
	}

}
