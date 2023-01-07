package JDBCConnectionPoling;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.*;

public class JDBCConnectionPool1 {

	public static void main(String[] args) throws SQLException {
		
		MysqlConnectionPoolDataSource datasource =new MysqlConnectionPoolDataSource(); //used for wbbapplication/enterpriseapplication
		
		datasource.setUrl("jdbc:mysql://localhost:3306/jdbclearn");
		
		datasource.setUser("root");
		
		datasource.setPassword("Trend@16");
		
		//logical connection bought from the pool
		Connection connection = datasource.getConnection(); //new connection won't created as it creating for DataManager, here the existing connection object will be returned from the connection pool
		
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery("select sid,sname,saddr from student");
		
		System.out.println("SID\tSNAME\tSADDRESS");
		
		while(resultset.next()) {
			
			int sid = resultset.getInt(1);
			String sname = resultset.getString(2);
			String saddress = resultset.getString(3);
			
			System.out.println(sid + "\t" + sname + "\t"+ saddress);
		}
		
		//sending the connection object back to connection pool
		connection.close();
		

	}

}
