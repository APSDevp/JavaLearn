package JDBCTransactions;

import java.sql.*;
import java.util.*;
import java.io.*;
import JDBCUtill.JDBCConnection;



public class JDBCTransactions01 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultset = null;
		ResultSet resultset1 = null;
        Scanner scanner = null;

		
		try {
			
			connection = JDBCConnection.getjdbcConnection();
			if (connection != null) {
				
			    stmt = connection.createStatement();
				
				System.out.println("Data Before transaction");
				System.out.println("-----------------------");
				resultset = stmt.executeQuery("select name, balance from accounts");
				
				while(resultset.next()) {
					System.out.println(resultset.getString(1)+"\t"+resultset.getInt(2));
				}
				
				System.out.println();
				System.out.println("Data after transaction");
				
				connection.setAutoCommit(false); //by default connection object will do auto  commit, to perform transaction we have to stop it
				
				stmt.executeUpdate("update accounts set balance = balance-30 where name='dhinesh'");
				stmt.executeUpdate("update accounts set balance = balance+30 where name='fet'");
				
				 scanner = new Scanner(System.in);
				System.out.println("Type Yes to commit to DB: ");
				String option = scanner.next();
				
				if(option.equalsIgnoreCase("yes")) {
					
					connection.commit();
					System.out.println("Commited to DB");
				} else {
					connection.rollback();
					System.out.println("Rollback has performed for the transaction");
				}
				
				System.out.println("---------------Data after Transaction commited---------");
                resultset1 = stmt.executeQuery("select name, balance from accounts");
				
				while(resultset1.next()) {
					System.out.println(resultset1.getString(1)+"\t"+resultset1.getInt(2));
				}
				
			}
			 

		} catch (SQLException se) {
			se.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.closeConnection(resultset, stmt, connection);
			

			if (scanner != null)
				scanner.close();

	}

	}

}
