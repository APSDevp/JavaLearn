package JDBCStoredProcedure;

import java.io.*;
import java.sql.*;
import JDBCUtill.JDBCConnection;

/* 
 * DELIMITER $$

USE `jdbclearn`$$

DROP PROCEDURE IF EXISTS `getStudents`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudents`(id INT)
BEGIN
            SELECT sid,sname,saddr
            FROM student
            WHERE sid = id;
	END$$

DELIMITER ;*/

public class StoredProcedure01 {

	public static void main(String[] args) throws SQLException, IOException {
		
		Connection connection = null;
		
		CallableStatement cstmt = null;
		
		ResultSet resultset = null;
	
		
		try {
 
			connection = JDBCConnection.getjdbcConnection();
			
			String storedprocedure = "{CALL getStudents(?)}"; //if we SP without any in we can call it using CALL getStudents()
			
			if(connection != null) {
				
				cstmt = connection.prepareCall(storedprocedure);
			
			}
			
			if(cstmt != null) {
				cstmt.setInt(1, 3);
				cstmt.execute(); //quey got executed
				resultset = cstmt.getResultSet(); //after query executed then result will be stored and will be captured using the resultset
			}
			
			if(resultset!= null) {
				
				if(resultset.next()) {
					System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
				}else {
					System.out.println("No Record found for the given value");
				}
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
