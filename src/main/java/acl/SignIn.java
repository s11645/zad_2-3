package acl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class SignIn {
	
	context.UseContext useContext;
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public boolean accomplished(HttpServletRequest request)
	{
		if((request.getParameter("username")=="")||(request.getParameter("password")=="")) return false;
		return true;
	}
	
	public boolean subsist(HttpServletRequest request)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
		   if(signUp.getUsername().equals(request.getParameter("username"))){
			   if(signUp.getPassword().equals(request.getParameter("password")))
			   {
				   return true;
			   }
		      break;
		   }
		}
		return false;
	}

}
