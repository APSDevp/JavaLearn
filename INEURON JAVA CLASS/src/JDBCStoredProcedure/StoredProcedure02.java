package JDBCStoredProcedure;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import JDBCUtill.JDBCConnection;

/* 
 * DELIMITER $$

CREATE
  
    PROCEDURE `jdbclearn`.`getStudentById`(IN id INT,OUT stdName VARCHAR(20),OUT stdAddr VARCHAR(20))

	BEGIN
                SELECT sname,saddr INTO stdName, stdAddr
                FROM student
                WHERE sid= id; 
	END$$

DELIMITER ; */

public class StoredProcedure02 {

	public static void main(String[] args) throws SQLException, IOException {
		
Connection connection = null;
		
		CallableStatement cstmt = null;
		
		ResultSet resultset = null;
	
		
		try {
 
			connection = JDBCConnection.getjdbcConnection();
			
			String storedprocedure = "{CALL getStudentByid(?,?,?)}";
			
			if(connection != null) {
				
				cstmt = connection.prepareCall(storedprocedure);
			
			}
			
			if(cstmt != null) {
				cstmt.setInt(1, 3);
			
				
				//register  the output parameter with the specific data for conversion
				//USE jdbcTYPES to map all java datatypes to dbspecific types
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.registerOutParameter(3, Types.VARCHAR); // informing the driver to do convert varchar output to java.lang.String 
				
				//in old way there will be geeer and setter to the conversion but here this is the way for SP.
				
				cstmt.execute();
				
				System.out.println("Name of the student is ::"+cstmt.getString(2));
				System.out.println("Address of the student is ::"+cstmt.getString(3));
				
				
			}
			
			
		} catch(SQLException se) {
			se.printStackTrace();
		}  catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCConnection.closeConnection(resultset, cstmt, connection);
		}
		

	}

}
