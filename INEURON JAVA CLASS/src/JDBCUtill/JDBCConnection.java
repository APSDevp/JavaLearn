package JDBCUtill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCConnection {
	
	private JDBCConnection() {
		
	}
	
	public static Connection getjdbcConnection() throws SQLException, IOException {

		Connection connection = null;
		Statement statement = null;

	    Properties props = new Properties();
	    
	  
	    FileInputStream fis = new  FileInputStream("jdbc.properties"); 
	    
	    props.load(fis);
	    
		   //String url = "jdbc:mysql://localhost:3306/jdbclearn";
		   
		   String url = props.getProperty("url");
		   String username= props.getProperty("username");
		   String password= props.getProperty("password");
		   
		   
		   
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
	
