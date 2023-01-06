package JDBCDateTime;

import java.util.*;

import JDBCUtill.JDBCConnection;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JDBCDT02 {

	public static void main(String[] args) throws SQLException,ParseException {
		
		// resource used 
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the name:: ");
		String name = scanner.next();
		
		System.out.print("Enter the date::(dd-mm-YYYY) ");
		String date = scanner.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		java.util.Date uDate = sdf.parse(date);
		
		long time = uDate.getTime();
		
		java.sql.Date sqlDate = new java.sql.Date(time); 
		
		System.out.println("String date us :: "+ date);
		System.out.println("Util date us :: "+ uDate);
		System.out.println("SQLDate date us :: "+ sqlDate);
		
		String sqlInsertQuery = "insert into usertable(`name`,`Date`) values(?,?)";
		
		try {
			
			connection = JDBCConnection.getjdbcConnection();
			
			if (connection != null)
			    System.out.println("Connection successful");
				pstmt = connection.prepareStatement(sqlInsertQuery);
				
				if(pstmt != null) {
					pstmt.setString(1,name);
					pstmt.setDate(2,sqlDate);
					
					int rowAffected = pstmt.executeUpdate();
					
					System.out.println("No of rows Affected is :: "+ rowAffected);
				}
			
		} catch(SQLException se) {
			
			se.printStackTrace();
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			JDBCConnection.closeConnection(null, pstmt, connection);
		}
		if(scanner != null) {
			scanner.close();
		}
		
		

	}

}
