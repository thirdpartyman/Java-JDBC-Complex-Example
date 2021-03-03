package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirebirdConnector extends ConnectorInterface {

	public FirebirdConnector(String database, String user, String password) {
		super(
			"org.firebirdsql.jdbc.FBDriver",
			"jdbc:firebirdsql://localhost/" + database,
			user,
			password
		);		
	}
	
	public FirebirdConnector(String database, String user, String password, String server, String port) {
		super(
			"org.firebirdsql.jdbc.FBDriver",
			"jdbc:firebirdsql://" + server + ":" + port + "/" + database,
			user,
			password
		);		
	}

}
