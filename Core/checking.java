package library.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class checking {
	
	public static void main(String[] args ) {
		try{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeewan", "root", "");
		System.out.println("Sucess.......");
		PreparedStatement psmt = conn.prepareStatement("select * from test");
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
		System.out.println("name: " + rs.getString("name"));
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
