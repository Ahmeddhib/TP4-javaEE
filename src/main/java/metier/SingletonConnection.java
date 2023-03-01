package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	//c'est une classe qu'ont instancier 1 fois, pour faire la cnx a la bdd
	private static Connection connection;
	static {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	connection= DriverManager.getConnection

	("jdbc:mysql://localhost:3306/DB_MVC_CAT","root","");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static Connection getConnection() {
		return connection;
	}

}
