import java.sql.* ;
import java.util.* ;


public class DatabaseUtilities {

	public DatabaseUtilities() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection getDBConnection() {
		
		Connection connection = null;

		// Load the database driver
	    try {
			Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
			
			 // Get a connection to the database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetracker?user=root&password=Legend123!" );
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   return connection;
	}
	
	
	// get data from db  (View only)
	
	public ResultSet getData(String query, Connection conn) {
		
		ResultSet rs =null;
		try
	    {
	       // Print all warnings
	       for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() )
	       {
	          System.out.println( "SQL Warning:" ) ;
	          System.out.println( "State  : " + warn.getSQLState()  ) ;
	          System.out.println( "Message: " + warn.getMessage()   ) ;
	          System.out.println( "Error  : " + warn.getErrorCode() ) ;
	       }

	       // Get a statement from the connection
	       Statement stmt = conn.createStatement() ;

	       // Execute the query
	       rs = stmt.executeQuery( query ) ;
	   }
	   catch( SQLException se )
	   {
	       System.out.println( "SQL Exception:" ) ;

	       // Loop through the SQL Exceptions
	       while( se != null )
	       {
	          System.out.println( "State  : " + se.getSQLState()  ) ;
	          System.out.println( "Message: " + se.getMessage()   ) ;
	          System.out.println( "Error  : " + se.getErrorCode() ) ;

	          se = se.getNextException() ;
	       }
	   }
	   catch( Exception e )
	   {
	      System.out.println( e ) ;
	   }
		
	   return rs;
		
	}
	
	
	// insert data in db  (Set Data in DB)
	public boolean insertData(String query, Connection conn) {
		
		try
	    {
	       // Print all warnings
	       for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() )
	       {
	          System.out.println( "SQL Warning:" ) ;
	          System.out.println( "State  : " + warn.getSQLState()  ) ;
	          System.out.println( "Message: " + warn.getMessage()   ) ;
	          System.out.println( "Error  : " + warn.getErrorCode() ) ;
	       }

	       // Get a statement from the connection
	       Statement stmt = conn.createStatement() ;
	    

	       // Execute the query
	       stmt.executeUpdate(query);
 
	   }
	   catch( SQLException se )
	   {
	       System.out.println( "SQL Exception:" ) ;

	       // Loop through the SQL Exceptions
	       while( se != null )
	       {
	          System.out.println( "State  : " + se.getSQLState()  ) ;
	          System.out.println( "Message: " + se.getMessage()   ) ;
	          System.out.println( "Error  : " + se.getErrorCode() ) ;

	          se = se.getNextException() ;
	          
	       }
	       return false;
	   }
	   catch( Exception e )
	   {
	      System.out.println( e ) ;
	      
	      return false;
	   }
		
	   return true;
		
	}
	// delete data in db  (Remove Data from DB)
	public boolean deleteData(String query, Connection conn) {
		
		try
	    {
	       // Print all warnings
	       for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() )
	       {
	          System.out.println( "SQL Warning:" ) ;
	          System.out.println( "State  : " + warn.getSQLState()  ) ;
	          System.out.println( "Message: " + warn.getMessage()   ) ;
	          System.out.println( "Error  : " + warn.getErrorCode() ) ;
	       }

	       // Get a statement from the connection
	       Statement stmt = conn.createStatement() ;
	    

	       // Execute the query
	       stmt.executeUpdate(query);
 
	   }
	   catch( SQLException se )
	   {
	       System.out.println( "SQL Exception:" ) ;

	       // Loop through the SQL Exceptions
	       while( se != null )
	       {
	          System.out.println( "State  : " + se.getSQLState()  ) ;
	          System.out.println( "Message: " + se.getMessage()   ) ;
	          System.out.println( "Error  : " + se.getErrorCode() ) ;

	          se = se.getNextException() ;
	          
	       }
	       return false;
	   }
	   catch( Exception e )
	   {
	      System.out.println( e ) ;
	      
	      return false;
	   }
		
	   return true;
		
	}
	
	// get list of data from db (Array of Records)
	
	
	 static void connectToTimeTrackerDB()
	 {
	    try
	    {
	       // Load the database driver
	       Class.forName( "com.mysql.cj.jdbc.Driver" ) ;

	       // Get a connection to the database
	       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetracker?user=root&password=Legend123!" );

	       // Print all warnings
	       for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() )
	       {
	          System.out.println( "SQL Warning:" ) ;
	          System.out.println( "State  : " + warn.getSQLState()  ) ;
	          System.out.println( "Message: " + warn.getMessage()   ) ;
	          System.out.println( "Error  : " + warn.getErrorCode() ) ;
	       }

	       // Get a statement from the connection
	       Statement stmt = conn.createStatement() ;

	       // Execute the query
	       ResultSet rs = stmt.executeQuery( "SELECT * FROM user" ) ;

	       // Loop through the result set
	       //System.out.println("hello");
	       
	       while( rs.next() )
	       {
	          System.out.println( rs.getString(1) ) ;
	          System.out.println( rs.getString(2) ) ;
	          System.out.println( rs.getString(3) ) ;
	       }
	       // Close the result set, statement and the connection
	       rs.close() ;
	       stmt.close() ;
	       conn.close() ;
	   }
	   catch( SQLException se )
	   {
	       System.out.println( "SQL Exception:" ) ;

	       // Loop through the SQL Exceptions
	       while( se != null )
	       {
	          System.out.println( "State  : " + se.getSQLState()  ) ;
	          System.out.println( "Message: " + se.getMessage()   ) ;
	          System.out.println( "Error  : " + se.getErrorCode() ) ;

	          se = se.getNextException() ;
	       }
	   }
	   catch( Exception e )
	   {
	      System.out.println( e ) ;
	   }
	 }
	 
	 
	 public static void main(String[] args) {
		    connectToTimeTrackerDB();
     }
	 
	
	
}



