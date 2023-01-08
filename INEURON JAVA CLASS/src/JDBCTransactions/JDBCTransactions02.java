package JDBCTransactions;

import java.sql.*;
import java.util.*;
import java.io.*;
import JDBCUtill.JDBCConnection;


public class JDBCTransactions02 {

	public static void main(String[] args) throws SQLException  {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultset = null;
		ResultSet resultset1 = null;
        Scanner scanner = null;

		
		try {
			
			connection = JDBCConnection.getjdbcConnection();
			if (connection != null) {
				
			    stmt = connection.createStatement();
			    
			    connection.setAutoCommit(false);
			    
			    stmt.executeUpdate("insert into polticians value('shashi tharoor','congress')");
			    stmt.executeUpdate("insert into polticians value('nalla kannu','cpim')");
			    stmt.executeUpdate("insert into polticians value('seeman','ntk')");
			    
			    Savepoint sp = connection.setSavepoint();
			    stmt.executeUpdate("insert into polticians value('rahul','bjp')");   //it is wrong party to test savePoint
			    //there must some check here to validate and to execute the rollback
			    System.out.println("Opps something went wrong need to rollback.");
			    
			    connection.rollback(sp);
			    
			    connection.commit();
			    
			}
			 

		} catch (SQLException se) {
			se.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.closeConnection(resultset, stmt, connection);
			

			

	}


	}

}
