package JDBCDateTime;

import java.util.*;

public class JDBCDT01 {

	public static void main(String[] args) {
		
		Date uDate = new java.util.Date();
		
		System.out.println(uDate); //Wed Jan 04 13:29:18 IST 2023
		
		long l = uDate.getTime();
		
		java.sql.Date sqlDate = new java.sql.Date(l); //it must have input time which is long return
		
		System.out.println(sqlDate);  //2023-01-04

	}

}
