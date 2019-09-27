package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Components.ClerkComponent;
public class RentalMain {
	/**
	 * 
	 */
	


	
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

		
	
	

}
