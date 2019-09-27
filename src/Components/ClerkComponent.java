package Components;

public class ClerkComponent {

	private String ClerkID;
	private String ClerkEmail;
	private String ClerkName;
	private String ClerkPhoneNum;
	
	
	public String getClerkId() {
		return ClerkID;
	}
	/**
	 * @param userId the userId to set
	 * @param ClerkID 
	 */
	public void setUserId(String ClerkID) {
		this.ClerkID = ClerkID;
	}
	/**
	 * @return the email
	 */
	public String getClerkEmail() {
		return ClerkEmail;
	}
	/**
	 * @param email the email to set
	 */
	public void setClerkEmail(String ClerkEmail)
	{
		this.ClerkEmail = ClerkEmail;
	}
	/**
	 * @return the firstName
	 */
	public String getClerkName() {
		return ClerkName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setClerkName(String ClerkName) {
		this.ClerkName = ClerkName;
	}

	
	public String getClerkPhoneNum() {
		return ClerkPhoneNum;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setClerkPhoneNum(String ClerkPhoneNum) {
		this.ClerkPhoneNum = ClerkPhoneNum;
	} 

}
