package comum;
import java.sql.*;


public class DBConnection {
	private static String DB_URL = "jdbc:mysql://localhost:3306/gamingsite";
    private static String USER = "root";
	private static String PASS = "";
	
	private static Connection connection;
	
	private DBConnection(){		
	}
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
		if(connection == null ||  connection.isClosed()){
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
		}		
		return connection;
	}
}
