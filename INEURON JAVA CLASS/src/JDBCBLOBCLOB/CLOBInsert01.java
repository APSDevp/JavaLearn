package JDBCBLOBCLOB;

import java.io.*;
import java.sql.*;

import JDBCUtill.JDBCConnection;

public class CLOBInsert01 {

	public static void main(String[] args)  throws SQLException, IOException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		
		try {
			String sqlInsertQuery ="insert into cities(`name`,`history`) values(?,?)";
			 
		
			connection = JDBCConnection.getjdbcConnection();
			
			if(connection != null) {
			 
			 pstmt = connection.prepareStatement(sqlInsertQuery);
			 
			}
			
			if(pstmt != null) {
			 pstmt.setString(1, "bengaluru");
			 
			 File f = new File("bengalur_hist.txt"); //adding image as file to the java application
			 
			 FileReader fis = new FileReader(f);   //file into stream so it can work as binary
			 
			 //setting the input information from java and sending the data to database
			 pstmt.setCharacterStream(2, fis);
			 
			 System.out.println("Inserting file from :: "+f.getAbsolutePath());
			 
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
