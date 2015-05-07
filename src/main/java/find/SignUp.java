package find;

import javax.servlet.ServletContext;

public class SignUp {
	
	private context.UseContext useContext;	
	
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public boolean findUsername(String username)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
			if(signUp.getUsername().equals(username)) return false;
		}
		return true;
	}

}
