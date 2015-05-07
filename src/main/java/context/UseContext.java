package context;

import java.util.ArrayList;

import javax.servlet.ServletContext;

public class UseContext {
	
	private ServletContext context;
	
	public UseContext(ServletContext context) {
		super();
		this.context=context;
	}
	
	public ArrayList<unit.SignUp> useSignUpArray()
	{
		return (ArrayList<unit.SignUp>)context.getAttribute("SignUpArray");
	}
	
	public String useSignInUsername()
	{
		return (String)context.getAttribute("SignInUsername");
	} 
	
	
	public ArrayList<unit.Profile> useProfileArray()
	{
		return (ArrayList<unit.Profile>)context.getAttribute("ProfileArray");
	}

}
