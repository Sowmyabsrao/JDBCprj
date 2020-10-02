package studentTable;

import java.sql.*;

public class BatchProcessing {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded...");
	 
	    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project","root","password");
	    System.out.println("Connected to the database");

	    Statement stmt=con.createStatement();
	    
	    con.setAutoCommit(false);
	    stmt.addBatch("insert into student values(007, 'Sowmya Rao', 12, 990)");
	    stmt.addBatch("update student set grade=5 where grade = 2");
	    stmt.addBatch("insert into student values(008, 'dummy1', 12, 990)");
	    stmt.addBatch("insert into student values(009, 'dummy2', 12, 990)");
	    stmt.addBatch("insert into student values(010, 'dummy3', 12, 990)");
	    stmt.addBatch("insert into student values(011, 'dummy4', 12, 990)");
	    stmt.addBatch("insert into student values(012, 'dummy5', 12, 990)");
	    stmt.addBatch("insert into student values(013, 'dummy6', 12, 990)");
	    stmt.addBatch("insert into student values(014, 'dummy7', 12, 990)");
	    stmt.addBatch("insert into student values(015, 'dummy8', 12, 990)");
	    
	    try {
			stmt.executeBatch();
			System.out.println("batch executed");
			con.commit();
		} catch (Exception e) {
			try
		    {
		        con.rollback();
		        System.out.println("batch cancelled");
		        e.printStackTrace();
		    }
		    catch(Exception e1)
		    {
		        System.out.println(e1);
		    }
		     con.close();   
		    }
	        
		
	    
	    
	}

}
