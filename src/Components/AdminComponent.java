package servlet;

public class AdminComponent {

		private String AdminName;
		private String Email;
		
		
		public String getAdminName() {
			return AdminName;
		}
		/**
		 * @param userId the userId to set
		 * @param ClerkID 
		 */
		public void setAdminName(String AdminName) {
			this.AdminName = AdminName;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return Email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String Email)
		{
			this.Email = Email;
		}
		
		} 


