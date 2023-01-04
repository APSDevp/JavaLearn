package JDBCUtill;

import java.sql.*;

public class JDBCConnection {
	
	private JDBCConnection() {
		
	}
	
	public static Connection getjdbcConnection() throws SQLException {

		Connection connection = null;
		Statement statement = null;

	
		   String url = "jdbc:mysql://localhost:3306/jdbclearn";
		   
		   String username= "root";
		   String password= "Trend@16";
		   
		   try {
				connection = DriverManager.getConnection(url, username, password);
				
				if(connection != null) 
					
					return connection;
					
				} catch(SQLException se) {
					se.printStackTrace();
				} catch(Exception e) {
					e.printStackTrace();
				}

            return connection;
               }
	
	        public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
	
			  
	        	if (resultSet != null) {
	    			resultSet.close();
	    		}
	    		if (statement != null) {
	    			statement.close();

	    		}
	    		if (connection != null) {
	    			connection.close();
	    		}
	  }
	}
	
