package model.dataccess;

import model.entities.User;
import java.sql.SQLException;
import model.entities.MessageException;

public class LoginBusiness {
	
	private static LoginBusiness lbInstance = null;
	
	private LoginBusiness() {}

	public static synchronized LoginBusiness getInstance() {
		
		if (lbInstance == null) {
			lbInstance = new LoginBusiness();
		}
		return lbInstance;
	}
	
	public Boolean verifyCredentials(String username, String password) throws ClassNotFoundException, MessageException, SQLException{
		
		if (username.equals("")) {
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			throw new MessageException("Password not informed.");
		} 

		User user = User.getInstance();
		user.setInfo(username, password);

		if (!(new LoginDataAccess().verifyCredentials(user))) {
			user.clearInfo();
			throw new MessageException("Incorrect credentials.");
		} else {
			return true;
		}
	}
}
