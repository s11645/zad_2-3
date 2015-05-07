package acl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class SignUp {
	
	context.UseContext useContext;
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}

	public boolean accomplished(HttpServletRequest request)
	{
		if((request.getParameter("username")=="")||(request.getParameter("password")=="")||(request.getParameter("confirm")=="")||(request.getParameter("email")=="")) return false;
		return true;
	}

	public boolean subsist(HttpServletRequest request)
	{
		for(unit.SignUp signUp: useContext.useSignUpArray())
		{
		   if((signUp.getUsername().equals(request.getParameter("username")))||(signUp.getEmail().equals(request.getParameter("email")))){
			   return false;
		   }
		}
		return true;
	}
	
	public boolean facilePassword(HttpServletRequest request)
	{
		if(request.getParameter("password").equals(request.getParameter("confirm"))) return true;
		return false;
	}
}
