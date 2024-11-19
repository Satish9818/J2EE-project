package org.jsp.userapp.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ProductDao {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	{
		Properties p = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\J2EE\\propertiesdemo\\properties-demo\\jdbc.properties");
			p.load(fin);
			con = DriverManager.getConnection(p.getProperty("url"), p);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
