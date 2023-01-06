package JDBCBLOBCLOB;

import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import JDBCUtill.JDBCConnection;

public class BLOBOpsRetrieve {

	public static void main(String[] args)  throws SQLException, IOException  {
	
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		FileOutputStream fos = null;
		try {
			String sqlSelectQuery ="select name,image from person where name = ?";
			 
		
			connection = JDBCConnection.getjdbcConnection();
			
			if(connection != null) {
			 
			 pstmt = connection.prepareStatement(sqlSelectQuery);
			 
			}
			
			if(pstmt != null) {
			
			//setting the first index to the string	
			 pstmt.setString(1, "Dhinesh");
			 
			 //execute the query
			 resultset = pstmt.executeQuery();
			 
			 if(resultset != null) {
				 if(resultset.next()) {
				
			     //fetching the name		 
				 String username = resultset.getString(1);
				 
				 //fetching the image and keeping it in harddisk
				 
				    InputStream  r = resultset.getBinaryStream(2);	
				    
				      //int i = r.read(); //read it from the stream and kept it in i --f we do this way then if 1024 charcs it will read and write 1024 times and performace will be low
			    
				       String fileName = "java_downd.jpg";
				       fos=   new FileOutputStream(fileName); //placeholder where the image needs to be stored
				       
				       /*
				       byte[] b = new byte[2048];				    
				     
				       while(r.read(b) > 0) { //until there is record read it
				    	 
				        fos.write(b); // write it to the file 
				     } */
				       
				       
				       //after adding commons jar from apache mvn repo , commented above line
				       
				       IOUtils.copy(r, fos); //it will reduce the complexvity
				       
				     System.out.println("Completed the process");
				     fos.flush();
				 } else {
					 System.out.println("record not available for the given ");
				 }
			 }
				 
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		}  catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCConnection.closeConnection(resultset, pstmt, connection);
			if(fos != null) {
				fos.close();
			}
		}
		
	}

	}


