package Connectors;

public class HyperSQLConnector extends ConnectorInterface {

	//Server
	public HyperSQLConnector() {
		super(
			"org.hsqldb.jdbcDriver",
			"jdbc:hsqldb:hsql://localhost/",
			"sa",
			""
		);
	}
	
	//Standalone
	public HyperSQLConnector(String fileName, String databaseName) {
		super(
			"org.hsqldb.jdbcDriver",
			"jdbc:hsqldb:file:" + fileName + "/" + databaseName,
			"sa",
			""
		);
	}
	
}
