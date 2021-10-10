package jdbcUtility;

import java.sql.*;

public class JDBCConnection {

	static String URL = "";
	static String username = "";
	static String password = "";
	static Connection conn;
	static Statement statement;
	static ResultSet response;

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			// com.sql.driver.Driver
			//jdbc:mysql://hostname/ databaseName -->>url format
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(URL, username, password);
			statement = conn.createStatement();
			response = statement.executeQuery("select * from emp");
			
			while(response.next()) {
				System.out.println(response.getString("name[1]"));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
