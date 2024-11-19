package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentByPS {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;

		String qry = "insert into student values(?,?,?,?,?)";

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			pst = con.prepareStatement(qry);

			// inserting 1st record

			pst.setInt(1, 12);
			pst.setString(2, "Virat");
			pst.setInt(3, 35);
			pst.setLong(4, 238682723L);
			pst.setDouble(5, 89);
			pst.executeUpdate();

			// inserting 2nd record

			pst.setInt(1, 13);
			pst.setString(2, "Rohit");
			pst.setInt(3, 36);
			pst.setLong(4, 218682723L);
			pst.setDouble(5, 38);
			pst.executeUpdate();

			// inserting 3rd record

			pst.setInt(1, 14);
			pst.setString(2, "Shami");
			pst.setInt(3, 37);
			pst.setLong(4, 211232723L);
			pst.setDouble(5, 76);
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (con != null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
					System.out.println("Prepared Statement Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
