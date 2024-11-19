package org.jsp.exam.controller;

public class CreateDatabase {
	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		String qry = "create table user(id int not null,name varchar(45) not null,phone bigint(20) unique not null,email varchar(45) unique not null,password varchar(45) not null,primary key(id))";

		Properties p = new Properties();
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(
					"C:\\Users\\LENOVO\\OneDrive\\Desktop\\J2EE\\propertiesdemo\\properties-demo\\jdbc.properties");
			p.load(fin);
			Class.forName(p.getProperty("driverClass"));
			con = DriverManager.getConnection(p.getProperty("url"), p);
			st = con.createStatement();
			st.execute(qry);

			System.out.println("User Table Created");
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
