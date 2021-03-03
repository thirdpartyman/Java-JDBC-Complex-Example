package Connectors;

public class MysqlConnector extends ConnectorInterface {

	public MysqlConnector(String database, String user, String password) {
		super(
			"com.mysql.cj.jdbc.Driver",
			"jdbc:mysql://localhost/" + database,
			user,
			password
		);		
	}
	
	public MysqlConnector(String database, String user, String password, String server, String port) {
		super(
			"com.mysql.cj.jdbc.Driver",
			"jdbc:mysql://" + server + ":" + port + "/" + database,
			user,
			password
		);		
	}

}
