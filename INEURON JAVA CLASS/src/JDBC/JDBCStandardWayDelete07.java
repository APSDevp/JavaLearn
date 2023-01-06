package JDBC;

import java.sql.*;

public class JDBCStandardWayDelete07 {

	public static void main(String[] args) throws SQLException {
		
		   Connection connection = null;
		   Statement statement = null;
		   ResultSet resultset = null;
	
		   String url = "jdbc:mysql://localhost:3306/jdbclearn";
		   
		   String username= "root";
		   String password= "Trend@16";
		   
		try {
			connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null) {
				
				statement = connection.createStatement();
				
				if(statement != null) {
					
					String sqlDeleteQuery = "delete from student where sage=29";
					
				    int noOfRows = statement.executeUpdate(sqlDeleteQuery);
					
					System.out.println("No of rows deleted are "+ noOfRows);
					
				}
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch(Exception fe) {
			fe.printStackTrace();
		} finally {
			if(statement != null) {
				statement.close();
			if(connection != null) {
				connection.close();
			}
			}
		}	   

	}

}
