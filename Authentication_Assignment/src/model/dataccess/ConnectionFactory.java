package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection createDBConnection() throws ClassNotFoundException, SQLException {

		final String URL = "jdbc:postgresql://localhost/authentication";
		final String USER = "postgres";
		final String PWD = "postgres";

		Class.forName("org.postgresql.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection(URL, USER, PWD);
		
		return conn;
	}
}
