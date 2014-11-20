package pcbuilder;

import java.sql.*;

public class MySQLdb {
	
	public void connectDB() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/javadb";
		String user = "root";
		String password = "rotterdam";


		Connection myConn = null;
        Statement myStmt = null;
        
		try {
			
		myConn = DriverManager.getConnection(url, user, password);
		
		myStmt = myConn.createStatement();
		
		String sql = "insert into onzin "
				   + " (jaonzin, hoi)"
				   + " values ('abed', 'Abed')";
		
		myStmt.executeUpdate(sql);
		
		System.out.println("Insert complete bro!!");
		
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
		
		}

}
