package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecutionJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Rajkumar@14");
		String s = "select * from employees";
		PreparedStatement preparedStatement = connection.prepareStatement(s);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while (executeQuery.next()) {
			String string = executeQuery.getString("last_name");
			System.out.println(string);
		}
	}

	private void TCo1() {
		System.out.println("Test 1");
	}
}