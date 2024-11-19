package practiceofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student age to display Details");
		int age = s.nextInt();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "admin");
			pst = con.prepareStatement("select * from student where age=?");
			pst.setInt(1, age);
			rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println("Student id: " + rs.getInt("id"));
				System.out.println("Student Name: " + rs.getString("name"));
				System.out.println("Student Age: " + rs.getInt("age"));
				System.out.println("Student PhoneNumber: " + rs.getLong("phone"));
				System.out.println("Student Percentage: " + rs.getDouble("perc"));
			}

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
