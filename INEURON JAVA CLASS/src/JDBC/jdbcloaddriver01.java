package JDBC;

import java.sql.*;

import com.mysql.cj.jdbc.Driver; //driver specific for MYSQL

public class jdbcloaddriver01 {

	public static void main(String[] args) throws SQLException {
		
		    //Step-1 Load and Register Driver
		
		
		   Driver driver = new Driver(); //creating driver object for MySQLDB //jar specific

		
		   DriverManager.registerDriver(driver); //java specific, asking java to use the MYSQL driver specific to communicate
		   
		   System.out.println("Driver registered");
		   
		   
		   
		   //Step-2 Establish connection between java and DB
		   
		   //JDBC URL Syantax :: <mainprotocal>:<subprotocol>(DB engine):<subname>
		   
		   String url = "jdbc:mysql://localhost:3306/passengerdata";
		   
		   String username= "root";
		   String password= "Trend@16";
		   
		   Connection connection = DriverManager.getConnection(url, username, password);  //provided my java
		   
		   //connection -> getConnection(url,username,password) created an object of the class which implements Connection(i)
		   //that class object is collected by Connection(I)
		   //This featute in java refers to
		   
		      //a) Abstraction(hiding internal services)
		      //b)Polymorpism(1:M -> multiple db drivers with one interface to implement)
		   
		   System.out.println("Connection object is created "+connection);
		   
		   System.out.println();
		   
		   System.out.println("Implementation class name of connection is :: "+ connection.getClass().getName());
		   
		   //Step-3 Create a statement object (To Move to the location using the connection)
		   
		   	Statement statement = connection.createStatement();
		   	
		   	System.out.println("Statement object is created "+ statement);
		   
		   
		   	//step-4 send and execute the query
		   	//Select
		   	//non-select query as per java developer
		   	
		   	//methods for executing the query
		   	
		   	//executeQuery() --> select operation
		   	//executeUpdate() --> for insert,update and delete query
		   	//execute() --> for both select and non-select query ------> return type is ResultSet
		   	
		   	String sqlSelectQuery = "select Pclass,Name from passengerdata.pasgr_data";
		   	
		   	ResultSet resultset = statement.executeQuery(sqlSelectQuery);
		   	
		   	System.out.println("Resultset object is created:: "+resultset);
		   	
		   	//processing the result from the ResultSet
		   	//next() to check if the next result is available or not, if available -> true
		   	
		   	System.out.println("PCLASS\tSNAME");
		   	
		   	while(resultset.next()) {
		   		Integer pclass =resultset.getInt(1);
		   		String name = resultset.getString(2);
		   		
		   		
		   		System.out.println(pclass+"\t"+name);
		   	}
		   	
		   	//close connection
		   	connection.close();
		   	System.out.println("Connection closed");

	}

}
