package AgileTesting;

public class RegisterBLL {

	public String Validate(String userName, String userEmail) {
		// TODO Auto-generated method stub
		if(userEmail.equals("abc")){
			return "email already exsit";
			
		}
		else
		{
			return "Registration Successfull. Check your e-mail";
		}
	}

	public boolean SendMail(String userName, String userEmail) {
		// TODO Auto-generated method stub
		return true;
	}

}
