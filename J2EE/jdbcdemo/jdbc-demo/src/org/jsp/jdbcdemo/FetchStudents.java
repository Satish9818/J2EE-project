package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudents {
	public static void main(String[] args) {
		String dql = "select * from student";
		String dml = "insert into student values(8,'dfsd',23,7123123,77.00)";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			st = con.createStatement();
			boolean res = st.execute(dml);// false
//			boolean res = st.execute(dql);  //true
			System.out.println(res);
			rs = st.getResultSet();
			System.out.println(rs);

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
		}
	}
}
