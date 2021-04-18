package com.selenium.e2eTests.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetElementFromDataBase {

	public static String element;

	public static String main() {

		try {

			// Create our mysql database connection
			String myDriver = ""; //com.mysql.....
			String myUrl = ""; //jdbc:oracle......
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "id", "mdp");

			// Enter our SQL SELECT query
			String query = "";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println("Element" + rs.getObject(1).toString());
				element = rs.getObject(1).toString();
				return element;
			}

			st.close();
		} catch (Exception e) {
			System.err.println("Got an exception! Pas de element disponible");
			System.err.println(e.getMessage());
		}

		return element;
	}

}
