package JDBCDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import JDBCUtill.JDBCConnection;

import java.sql.*;

public class JDBCDT03 {

	public static void main(String[] args) throws SQLException,ParseException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the name:: ");
		
		String name = scanner.next();
		
		
		String sqlSelectQuery = "select name, Date from usertable where name=?";
		
		try {
			
			connection = JDBCConnection.getjdbcConnection();
			
			if (connection != null)
			    System.out.println("Connection successful");
				pstmt = connection.prepareStatement(sqlSelectQuery);
				
				if(pstmt != null) {
					pstmt.setString(1,name);
	
					
					resultset = pstmt.executeQuery();
					System.out.println("Result set is :: "+ resultset);
				}
				
				if(resultset != null) {
					
					while(resultset.next()) {
					String userName = resultset.getString(1);
					Date userDob = resultset.getDate(2);
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					
					String date = sdf.format(userDob);
					
					System.out.println("Name is ::"+ userName);
					System.out.println("Dob is ::"+ date);
					}
				} else {
					System.out.println("no data");
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


