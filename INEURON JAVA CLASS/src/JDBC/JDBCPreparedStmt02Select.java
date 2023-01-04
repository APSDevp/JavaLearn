package JDBC;

import java.sql.*;

import JDBCUtill.JDBCConnection;
import java.util.Scanner;

public class JDBCPreparedStmt02Select {

	public static void main(String[] args)  throws SQLException {
	   
		// Resource used in jdbc
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sid: ");
		int sid = scanner.nextInt();
		
		String sqlSelectQuery = "select sid, sname, sage, saddr from student where sid=?";
		try {
			connection = JDBCConnection.getjdbcConnection();
			if (connection != null)
			    System.out.println("Connection successful");
				pstmt = connection.prepareStatement(sqlSelectQuery);
			
			if(pstmt != null) {
				pstmt.setInt(1, sid);    
				System.out.println("Connecting DB for executing the query");
				
				resultset = pstmt.executeQuery();
				
				System.out.println("Execution Successful");
				
			if(resultset != null) {	
	
				
			   	if(resultset.next()) {  //here using if because based on the query we will be getting single row as o/p or 0 row
			   		System.out.println("sid"+"\t"+"sname"+"\t"+"sage");
			   		Integer sidj =resultset.getInt(1);
			   		String sname = resultset.getString(2);
			   		Integer sage =resultset.getInt(3);
			   		
			   		
			   		System.out.println(sidj+"\t"+sname+"\t"+sage);
			   	} else {
			   		System.out.println("Record not available");
			   	}
			}
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.closeConnection(resultset, pstmt, connection);
	}

}

	}


