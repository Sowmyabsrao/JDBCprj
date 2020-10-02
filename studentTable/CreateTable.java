package studentTable;

import java.sql.*;
/*import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;*/

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project","root","password");
		System.out.println("Connected to the database");
		
		Statement st = connection.createStatement();
		//System.out.println("Before creating the table...");
		
		/*st.execute("create table student(id integer, name varchar(20), grade integer, marks integer)");
		System.out.println("table created");
		
		st.execute("show tables");
		System.out.println("showing table created");
		*/
		
		//st.executeUpdate("insert into student values(001, 'John Smith', 8, 900)");
		//System.out.println("Inserting row into table");
		
		/*st.executeUpdate("insert into student values(002, 'Jon Smith', 8, 910)");
		st.executeUpdate("insert into student values(003, 'Sonia Rao', 9, 990)");
		st.executeUpdate("insert into student values(004, 'John oliver', 2, 800)");
		st.executeUpdate("insert into student values(005, 'Anne frank', 12, 1000)");
		st.executeUpdate("insert into student values(006, 'Mark Twain', 4, 925)");
		*/
		
		//st.executeUpdate("update student set name = 'Jon king' where name = 'jon smith'");
		//System.out.println("row updated");
		
		 DatabaseMetaData rsmd=connection.getMetaData();
		    
	     System.out.println("database name="+rsmd.getDatabaseProductName());
	     System.out.println("database version="+rsmd.getDatabaseProductVersion());
	     System.out.println("Driver version="+rsmd.getDriverVersion());
	     System.out.println("Table name size="+rsmd.getMaxTableNameLength());
	     System.out.println("max no. of columns="+rsmd.getMaxColumnsInTable());  
		
		connection.close();
        System.out.println("Connection closed...");
	
	}

}
