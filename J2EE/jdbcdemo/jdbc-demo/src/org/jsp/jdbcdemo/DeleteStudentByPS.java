package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudentByPS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Student ID to Update");

		int id = s.nextInt();

		String qry = "delete from student  where id=?";
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			pst = con.prepareStatement(qry);

			pst.setInt(1, id);

			int r = pst.executeUpdate();

			System.out.println(r + " rows Deleted");

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
