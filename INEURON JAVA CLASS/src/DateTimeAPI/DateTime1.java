package DateTimeAPI;

public class DateTime1 {

	public static void main(String[] args) {
		
		//util.date is deprecated
		
		java.util.Date utilDate = new java.util.Date(); //for general purpose
		
		System.out.println(utilDate);
		
		long hour = utilDate.getHours();
		
		System.out.println(hour);
		
		
		java.sql.Date SqlDatehr = new java.sql.Date(hour);
		System.out.println(SqlDatehr);
		
		
		long time = utilDate.getTime(); //giving time in miliseconds
		
		System.out.println(time); 
		
		java.sql.Date SqlDate = new java.sql.Date(time); // for DB purpose
		
		System.out.println(SqlDate);
	}

}
