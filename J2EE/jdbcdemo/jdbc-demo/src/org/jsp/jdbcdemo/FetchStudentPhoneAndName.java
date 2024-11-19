package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudentPhoneAndName {
	public static void main(String[] args) {
		String dql = "select * from student";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(dql);

			if (rs.absolute(2)) {
				System.out.println("Student ID: " + rs.getInt("id"));
				System.out.println("Student Name: " + rs.getString(2));
				System.out.println("Age: " + rs.getInt(3));
				System.out.println("Phone: " + rs.getLong(4));
				System.out.println("Percentage: " + rs.getDouble("perc"));
				System.out.println("-----------------------------------");
			}

		} catch (ClassNotFoundException | SQLException e) {
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
			if (rs != null) {
				try {
					rs.close();
					System.out.println("ResultSet Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
