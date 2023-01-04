package JDBC;

import java.sql.*;

public class JDBCStandardWay03 {

	public static void main(String[] args) throws SQLException {
		
		   Connection connection = null;
		   Statement statement = null;
		   ResultSet resultset = null;
	
		   String url = "jdbc:mysql://localhost:3306/passengerdata";
		   
		   String username= "root";
		   String password= "Trend@16";
		   
		try {
			connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null) {
				
				statement = connection.createStatement();
				
				if(statement != null) {
					
					String sqlSelectQuery = "select Pclass,Name from passengerdata.pasgr_data";
					
					resultset = statement.executeQuery(sqlSelectQuery);
					
				   	System.out.println("Resultset object is created:: "+resultset);
			  	   	
				   	System.out.println("PCLASS\tSNAME");
				   	
				   	while(resultset.next()) {
				   		Integer pclass =resultset.getInt(1);
				   		String name = resultset.getString(2);
				   		
				   		
				   		System.out.println(pclass+"\t"+name);
				   	}
				}
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch(Exception fe) {
			fe.printStackTrace();
		} finally {
			if(resultset != null);
			     resultset.close();
			if(statement != null) {
				statement.close();
			if(connection != null) {
				connection.close();
			}
			}
		}	   

	}

}
