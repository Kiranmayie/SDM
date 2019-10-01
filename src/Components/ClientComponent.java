package Components;

public class ClientComponent {

	
	

		private String FirstName;
		private String LastName;
		private String DriverLicense;
		private String ExpirationDate;
		private String Phonenum;
		
		
		public String getFirstName() {
			return FirstName;
		}
		/**
		 * @param userId the userId to set
		 * @param ClerkID 
		 */
		public void setFirstName(String FirstName) {
			this.FirstName = FirstName;
		}
		/**
		 * @return the email
		 */
		public String getLastName() {
			return LastName;
		}
		/**
		 * @param email the email to set
		 */
		public void setLastName(String LastName)
		{
			this.LastName = LastName;
		}
		/**
		 * @return the firstName
		 */
		public String getDriverLicense() {
			return DriverLicense;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setDriverLicense(String DriverLicense) {
			this.DriverLicense = DriverLicense;
		}

		
		public String getPhonenum() {
			return Phonenum;
		}
		/**
		 * @param contact the contact to set
		 */
		public void setPhonenum(String Phonenum) {
			this.Phonenum = Phonenum;
		}
		public String getExpirationDate() {
			return ExpirationDate;
		}
		public void setExpirationDate(String expirationDate) {
			ExpirationDate = expirationDate;
		} 

	}

