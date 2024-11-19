package org.jsp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {

		FileInputStream fin = null;

		Properties p = new Properties();

		try {
			fin = new FileInputStream(
					"C:\\Users\\LENOVO\\OneDrive\\Desktop\\J2EE\\propertiesdemo\\properties-demo\\jdbc.properties");
			p.load(fin);
			System.out.println("url");
			System.out.println("driverClass");
			System.out.println("user");
			System.out.println("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
