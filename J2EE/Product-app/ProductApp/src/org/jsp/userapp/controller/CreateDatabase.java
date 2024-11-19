package org.jsp.userapp.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateDatabase {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		String qry = "create table product(id int not null,name varchar(45) not null,brand varchar(45) not null,category varchar(45) not null,description varchar(45),cost Bigint(20) not null,imageurl varchar(45), primary key(id))";

		Properties p = new Properties();
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\J2EE\\Product-app\\ProductApp\\jdbc.properties");
			p.load(fin);
			Class.forName(p.getProperty("driverClass"));
			con = DriverManager.getConnection(p.getProperty("url"), p);
			st = con.createStatement();
			st.execute(qry);

			System.out.println("Product Table Created");
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
