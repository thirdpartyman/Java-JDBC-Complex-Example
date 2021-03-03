package Connectors;

import java.sql.DriverManager;

public class CubridConnector {

}


//try {
//	Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
//
//	// Connect to the "demodb" database
//	connection = DriverManager.getConnection("jdbc:cubrid:localhost:30000:testdb:public::", "admin", "dontforget");
//	System.out.println("Connected  to  demodb.");
//	connection.close();
//	System.out.println("Disconnected  from  demodb.");
//} catch (Exception e) {
//	e.printStackTrace();
//}