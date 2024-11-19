package org.jsp.userapp.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperty {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("driverClass", "com.mysql.cj.jdbc.Driver");
		p.setProperty("url", "jdbc:mysql://localhost:3306/jdbc_demo");
		p.setProperty("user", "root");
		p.setProperty("password", "admin");

		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream(
					"C:\\Users\\LENOVO\\OneDrive\\Desktop\\J2EE\\Product-app\\ProductApp\\jdbc.properties");

			p.store(fout, "Adding the Properties for JDBC");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
