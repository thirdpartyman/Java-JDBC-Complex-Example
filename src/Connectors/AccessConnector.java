package Connectors;

public class AccessConnector extends ConnectorInterface {

	public AccessConnector(String databasePath) {
		super(
			"net.ucanaccess.jdbc.UcanaccessDriver",
			"jdbc:ucanaccess://" + databasePath,
			"",
			""
		);
	}
	
}
