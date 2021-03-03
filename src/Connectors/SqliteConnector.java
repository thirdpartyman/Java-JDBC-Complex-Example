package Connectors;

public class SqliteConnector extends ConnectorInterface {

	public SqliteConnector(String databasePath) {
		super(
			"org.sqlite.JDBC",
			"jdbc:sqlite:" + databasePath,
			"",
			""
		);
	}
	
}
