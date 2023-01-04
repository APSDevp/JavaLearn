package JDBC;

import java.util.Scanner;

import java.sql.*;

import JDBCUtill.JDBCConnection;

public class JDBCPreparedStmt01 {

	public static void main(String[] args) throws SQLException {
		
		// Resource used in jdbc
				Connection connection = null;
				PreparedStatement pstmt = null;

				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the sage: ");
				int sage = scanner.nextInt();

				System.out.print("Enter the sname:: ");
				String sname = scanner.next();

				System.out.print("Enter the saddress:: ");
				String saddr = scanner.next();

				String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddr`) values(?,?,?)";
				try {
					connection = JDBCConnection.getjdbcConnection();
					if (connection != null)
					     
						pstmt = connection.prepareStatement(sqlInsertQuery);
					if(pstmt != null) {
						pstmt.setString(1, sname);
						pstmt.setInt(2, sage);
						pstmt.setNString(3, sname);
						
						int rowAffected = pstmt.executeUpdate();
						
						System.out.println("No of rows Affected is :: "+ rowAffected);
					}

				} catch (SQLException se) {
					se.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					JDBCConnection.closeConnection(null, pstmt, connection);

					if (scanner != null)
						scanner.close();
			}

	}

}
