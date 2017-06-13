package SeleniumGenric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	public static void main(String[] args) {
		m1();
		System.out.println("pass");
	}

	public static void m1() {
		try {
			Connection cnc=DriverManager.getConnection("jdbc:sqlyog://localhost:3306/vtigercrm", "root", "root");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
