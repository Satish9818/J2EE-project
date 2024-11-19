package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultipleValues {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			st = con.createStatement();
			st.execute("insert into student values(11,'me',25,777,65)");
			st.execute("insert into student values(9,'me',25,888,75)");
			st.execute("insert into student values(10,'me',25,999,85)");
		}catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (con != null) {
				try {
					con.close();
					System.out.println("Statement closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
					System.out.println("Statement Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
