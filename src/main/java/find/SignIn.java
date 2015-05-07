package find;

import javax.servlet.ServletContext;

public class SignIn {
	
	private context.UseContext useContext;	
	
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public boolean findRare(String username)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
			if(signUp.getUsername().equals(username))
			{
				if(signUp.isAdminCheck()) return true;
			}
		}
		return false;
	}
	
	public boolean findUncommon(String username)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
			if(signUp.getUsername().equals(username))
			{
				if(signUp.isPremiumCheck()) return true;
			}
		}
		return false;
	}

}
