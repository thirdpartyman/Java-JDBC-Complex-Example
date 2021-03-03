package Connectors;

public class MssqlConnector extends ConnectorInterface {

	public MssqlConnector(String database, String user, String password) {
		super(
			"com.microsoft.sqlserver.jdbc.SQLServerDriver",
			"jdbc:sqlserver://localhost/" + database,
			user,
			password
		);		
	}
	
	public MssqlConnector(String database, String user, String password, String server, String port) {
		super(
			"com.microsoft.sqlserver.jdbc.SQLServerDriver",
			"jdbc:sqlserver://" + server + ":" + port + "/" + database,
			user,
			password
		);		
	}

}
