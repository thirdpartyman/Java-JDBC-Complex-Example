package Connectors;

public class OracleConnector extends ConnectorInterface {

	public OracleConnector(String database, String user, String password) {
		super(
			"oracle.jdbc.OracleDriver",
			"jdbc:oracle:thin:@localhost:1521:" + database,
			user,
			password
		);		
	}
	
	public OracleConnector(String database, String user, String password, String server, String port) {
		super(
			"oracle.jdbc.OracleDriver",
			"jdbc:oracle:thin:@" + server + ":" + port + ":" + database,
			user,
			password
		);		
	}

}
