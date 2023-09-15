package Newproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//1.import packages

public class Student1 {

	public static void main(String[] args) throws Exception {
		//2.loading the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//3.establishing connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "LUCKY KUMAR777");
		
		//4.create statement
		Statement st=con.createStatement();
		
		//5.Execute the statement
		 ResultSet set=st.executeQuery("select* from Student_info");
		 
		 //6.Print the o/p
		 System.out.println("StudentTable:");
		 while(set.next())
			 System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3));
		 
		 
		 
		 //7.close the connections
		 con.close();
		 st.close();
		 set.close();
		
		
		

	}
 
}