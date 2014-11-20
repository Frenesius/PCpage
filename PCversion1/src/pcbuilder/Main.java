package pcbuilder;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		MySQLdb sqlDB = new MySQLdb();
		
		try {
			sqlDB.connectDB();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
