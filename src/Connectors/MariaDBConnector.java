package Connectors;

public class MariaDBConnector extends ConnectorInterface {

	public MariaDBConnector(String database, String user, String password) {
		super(
			"org.mariadb.jdbc.Driver",
			"jdbc:mariadb://localhost/" + database,
			user,
			password
		);		
	}
	
	public MariaDBConnector(String database, String user, String password, String server, String port) {
		super(
			"org.mariadb.jdbc.Driver",
			"jdbc:mariadb://" + server + ":" + port + "/" + database,
			user,
			password
		);		
	}

}
