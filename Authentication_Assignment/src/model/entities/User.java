package model.entities;

public class User {

	private String userName;
	private String password;

	private static User userInstance = null;

	private User() {
	}

	public static synchronized User getInstance() {

		if (userInstance == null) {
			userInstance = new User();
		}
		return userInstance;
	}

	public void setInfo(String userName, String password) {
		userInstance.userName = userName;
		userInstance.password = password;
	}

	public void clearInfo() {
		userInstance.userName = "";
		userInstance.password = "";
	}
	
	public String getUserName() { 
		return userName; 
	}
	
	public String getPassword() {
		return password;
	}

}
