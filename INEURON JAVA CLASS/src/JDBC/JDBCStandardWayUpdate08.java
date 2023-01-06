package JDBC;

import java.sql.*;

public class JDBCStandardWayUpdate08 {

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
					
					String sqlInsertQuery = "update student set sage=38 where sname='dhinesh'";
					
				    int noOfRows = statement.executeUpdate(sqlInsertQuery);
					
					System.out.println("No of rows updated are "+ noOfRows);
					
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
