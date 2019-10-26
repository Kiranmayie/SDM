package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Components.ClerkComponent;
import Components.ClientComponent;
public class RentalMain {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement preparedStmt = null;
		ResultSet rs = null;
		String sql = null;
		public String checkLogin(ClerkComponent clerk) {
			boolean row = false;
			String fname = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "Kiran@28");

				if (con != null) {
					System.out.println("Connected");
					preparedStmt = con.prepareStatement("SELECT * FROM tblclerk where clerkName=? and clerkEmail=?");
					preparedStmt.setString(1, clerk.getClerkName());
					preparedStmt.setString(2, clerk.getClerkEmail());

					ResultSet rs = preparedStmt.executeQuery();

					while (rs.next()) {
						row = true;
						fname = rs.getString(2);

					}

				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return fname;
		}
		
		
		public String checkAdminLogin(AdminComponent admin) {
			boolean row = false;
			String fname = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "Kiran@28");

				if (con != null) {
					System.out.println("Connected");
					preparedStmt = con.prepareStatement("SELECT * FROM tbladmin where adminName=? and adminEmail=?");
					preparedStmt.setString(1, admin.getAdminName());
					preparedStmt.setString(2, admin.getEmail());

					ResultSet rs = preparedStmt.executeQuery();

					while (rs.next()) {
						row = true;
						fname = rs.getString(2);

					}

				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return fname;
		}
		
		
		
		public String addNewClient(ClientComponent client)
		{
			boolean row = false;
			String firstname = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "Kiran@28");

				if (con != null) {
					System.out.println("Connected");
					preparedStmt = con.prepareStatement("SELECT * FROM tblclerk where clerkName=? and clerkEmail=?");
					preparedStmt.setString(1, client.getFirstName());
					preparedStmt.setString(2, client.getLastName());
					preparedStmt.setString(3, client.getDriverLicense());
					preparedStmt.setString(4, client.getExpirationDate());
					preparedStmt.setString(5, client.getPhonenum());
					

					ResultSet rs = preparedStmt.executeQuery();

					while (rs.next()) {
						row = true;
						firstname = rs.getString(1);

					}

				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return firstname;
		}

		
	
	

}
