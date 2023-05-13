package JDBCRowset;

import java.sql.SQLException;

import javax.sql.rowset.*;


//not recommended use the result set
public class Rowset01 {

	public static void main(String[] args) throws SQLException {
		
		//factory method which which used to create an object of any rowset object
		RowSetFactory factory = RowSetProvider.newFactory();
		
		JdbcRowSet jdbcrowset = factory.createJdbcRowSet();
		
		CachedRowSet createCachedRowSet = factory.createCachedRowSet();
		
		FilteredRowSet filteredrowset = factory.createFilteredRowSet();
		
		JoinRowSet joinrowset = factory.createJoinRowSet();
		
		WebRowSet webrowset = factory.createWebRowSet();

	}

}
