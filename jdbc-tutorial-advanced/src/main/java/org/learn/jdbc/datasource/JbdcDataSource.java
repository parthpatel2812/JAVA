package org.learn.jdbc.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JbdcDataSource {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test_database?useUnicode="
			+ "true&useJDBCCompliantTimezoneShift=" + "true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	private static final String USER_NAME = "root";
	private static final String PASSWORD = "npp8140060700";

	public static final Connection getConnection() {

		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			return connection;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	

}
