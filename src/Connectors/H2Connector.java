package Connectors;

public class H2Connector extends ConnectorInterface {

	public H2Connector(String databaseFilename) {
		super(
			"org.h2.Driver",
			"jdbc:h2:./" + databaseFilename,
			"sa",
			""
		);
	}
	
	public H2Connector(String databaseFilename, String databasePath) {
		super(
			"org.h2.Driver",
			"jdbc:h2://" + databasePath + databaseFilename,
			"sa",
			""
		);
	}
	
}
