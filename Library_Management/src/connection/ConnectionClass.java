package connection;
import java.sql.*;  

public class ConnectionClass {

	java.sql.Connection con = null;
	
	public Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/library";
		String username = "root";
		String password = "sneha";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		    System.out.println("Database connected!");
		} catch (SQLException e) {
		    throw new IllegalStateException(e.getMessage());
		}
		
		return con;
	}
	
}