package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ApacheDerbyConnector extends ConnectorInterface {

	public ApacheDerbyConnector(String database, String user, String password, String path) {
		super(
			"org.apache.derby.jdbc.EmbeddedDriver",
			"jdbc:derby:" + path + "/" + database + ";create=true",
			user,
			password
		);		
	}
	
	public enum Subprotocol {
		memory("memory:"),
	    classpath("classpath:"),
	    jar("jar:"),
	    localhost("//localhost/");

	    private final String url;

	    Subprotocol(String url) {
	        this.url = url;
	    }

	    public String getUrl() {
	        return url;
	    }
	}
	
	public ApacheDerbyConnector(String database, String user, String password, Subprotocol subprotocol) {
		super(
			"org.apache.derby.jdbc.EmbeddedDriver",
			"jdbc:derby:" + subprotocol.getUrl() + database + ";create=true",
			user,
			password
		);		
	}
	
	public ApacheDerbyConnector(String database, String user, String password, String server, String port) {
		super(
			"org.apache.derby.jdbc.EmbeddedDriver",
			"jdbc:derby://" + server + ':' + port + '/' + database + ";create=true",
			user,
			password
		);		
	}
	
	public ApacheDerbyConnector() {
		super(
			"org.apache.derby.jdbc.EmbeddedDriver",
			"jdbc:derby://localhost/webdb2;create=true",
			"tom",
			"secret"
		);		
	}

}




//	Following is the syntax of Derby JDBC database connection URL for the embedded driver:
//	jdbc:derby:[subsubprotocol:][databaseName][;attribute=value]*
	  
//	Where subsubprotocol tells where Derby should look for the database. It can be one of:
//	 - directory: looks for the database in the file system. The directory can be relative path or absolute path. For the relative path, Derby will look in the system directory (specified by the environment variable user.dir). This is the default location if subsubprotocol is not specified.
//	 - memory: looks for the database in memory. This may e useful in case we only use a temporary database.
//	 - classpath: looks for the database in the file system which is relative to the classpath directory. In this way the database is treated as in read-only mode.
//	 - jar: looks for the database inside a jar or zip file. Read-only mode.

//	attribute=value: specifies one or more additional attributes when making the connection. Some commonly used attributes are:
//	 - create=true: creates the database if it does not exist.
//	 - shutdown=true: closes the database. This must be used without database name.
//	 - user=<username>: specifies the username to connect.
//	 - password=<password>: specifies password of the username to connect.

//	Here is the syntax of Derby JDBC database connection URL for the network client driver:
//	jdbc:derby://server[:port]/databaseName[;attribute=value]*
//	The default port is 1527 if omitted.
