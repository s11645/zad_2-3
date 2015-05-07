package find;

import javax.servlet.ServletContext;

public class Pacc {
	
	context.UseContext useContext;	
	
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public boolean findPacc(String username, boolean promoted)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
			if(signUp.getUsername().equals(username))
			{
				signUp.setPremiumCheck(promoted);
				return true;
			}
		}
		return false;
	}
}
