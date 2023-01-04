package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCStandardWayInsert05 {

	public static void main(String[] args) throws SQLException {
		
		   Connection connection = null;
		   Statement statement = null;
		   ResultSet resultset = null;
	
		   String url = "jdbc:mysql://localhost:3306/jdbclearn";
		   
		   String username= "root";
		   String password= "Trend@16";
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the sage: ");
		   int sage = scanner.nextInt();
		   
		   System.out.println("Enter the sname: ");
		   String sname = scanner.next();
		   
		   System.out.println("Enter the saddr: ");
		   String saddr = scanner.next();
		   
		   sname = " ' " + sname + " ' "; //strings are varchar and need to be enclsed in single quote
		   saddr = " ' " + saddr + " ' ";
		   
		   
		try {
			connection = DriverManager.getConnection(url, username, password);
			
			if (connection != null) {
				
				statement = connection.createStatement();
				
				if(statement != null) {
					
					//String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddr`) values ('dhinesh',29,'mettur')";
					
					//sname is string to pass it in query it should be single quoted, below from insert to values" is string later string concat and last seprate ")" for bracket
					
					 //String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddr`) values ("+sname+","+sage+","+saddr+")"; 
					
					//%s -> string, %d -> int, %f -> float
					
					String sqlInsertQuery =  String.format("insert into student(`sname`,`sage`,`saddr`) values ('%s','%d','%s')",sname,sage,saddr);
					
				    int noOfRows = statement.executeUpdate(sqlInsertQuery);
					
					System.out.println("No of rows affected are "+ noOfRows);
					
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
			if(scanner != null) {
				scanner.close();
			}
			}
			}
		}	   

	}

}
