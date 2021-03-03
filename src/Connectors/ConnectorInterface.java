package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectorInterface {
	// JDBC driver name and database URL
	public final String JDBC_DRIVER;
	public final String DB_URL;

	// Database credentials
	public final String USER;
	public final String PASS;

	protected ConnectorInterface(String JDBC_DRIVER, String DB_URL, String USER, String PASS)
	{
		this.JDBC_DRIVER = JDBC_DRIVER;
		this.DB_URL = DB_URL;
		this.USER = USER;
		this.PASS = PASS;	
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if (connection == null)
		{
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		
		return connection;
	}
	
	private Connection connection = null;
}
