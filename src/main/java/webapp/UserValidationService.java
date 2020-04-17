package webapp;

public class UserValidationService {
	public static boolean isUserValid(String userName,String password) {
		if(userName.equals("divyadeka") && password.equals("password01")
		) {
			return true;
		}else 
			return false;
	}
}
