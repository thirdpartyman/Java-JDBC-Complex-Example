package Connectors;

public class PostgresConnector extends ConnectorInterface {

	public PostgresConnector(String database, String user, String password) {
		super(
			"org.postgresql.Driver",
			"jdbc:postgresql://localhost:5432/" + database,
			user,
			password
		);		
	}
	
	public PostgresConnector(String database, String user, String password, String server, String port) {
		super(
			"org.postgresql.Driver",
			"jdbc:postgresql://" + server + ":" + port + "/" + database,
			user,
			password
		);		
	}

}
