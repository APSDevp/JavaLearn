package JDBCBLOBCLOB;

import java.io.*;
import java.sql.*;

import JDBCUtill.JDBCConnection;

public class BLOBOps01 {
 
	public static void main(String[] args)  throws SQLException {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		
		try {
			String sqlInsertQuery ="insert into person(`name`,`image`) values(?,?)";
			 
		
			connection = JDBCConnection.getjdbcConnection();
			
			if(connection != null) {
			 
			 pstmt = connection.prepareStatement(sqlInsertQuery);
			 
			}
			
			if(pstmt != null) {
			 pstmt.setString(1, "Dhinesh");
			 
			 File f = new File("JavaSCP.jpg"); //adding image as file to the java application
			 
			 FileInputStream fis = new FileInputStream(f);   //file into stream so it can work as binary
			 
			 //setting the input information from java and sending the data to database
			 pstmt.setBlob(2, fis);
			 
			 System.out.println("Inserting image from :: "+f.getAbsolutePath());
			 
			int noOfRows =  pstmt.executeUpdate();
			
			if(noOfRows == 1) {
				System.out.println("Record inserted successfuly");
			} else {
				System.out.println("Insertion failed");
			}
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch (FileNotFoundException es) {
			es.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCConnection.closeConnection(null, pstmt, connection);
		}
		
	}
}
