package acl;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class Attributes {
	
	
	context.UseContext useContext;
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public boolean usernameAdressType(String username, HttpServletRequest request, ArrayList<unit.Profile> profileArray)
	{
		for(unit.Profile profile : profileArray)
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(request.getParameter("typAdresu"))) return false;
			}
		}
		return true;
	}
	
	public boolean adressTypeNull(HttpServletRequest request)
	{
		if(request.getParameter("typAdresu")==null) return false;
		return true;
	}
	
	public boolean usernameNotSubsist(String username)
	{
		for(unit.SignUp signUp : useContext.useSignUpArray())
		{
			if(signUp.getUsername().equals(username)) return true;
		}
		return false;
	}
	
	public boolean editNull(HttpServletRequest request)
	{
		if(request.getParameter("adressTypeEdit")==null) return false;
		return true;
	}
	
	
	//edit
	
	public boolean provinceEdit(HttpServletRequest request)
	{
		if(request.getParameter("provinceEdit")==null) return false;
		return true;
	}
	
	public boolean cityEdit(HttpServletRequest request)
	{
		if(request.getParameter("cityEdit")==null) return false;
		return true;
	}
	
	public boolean postalCodeEdit(HttpServletRequest request)
	{
		if(request.getParameter("postalCodeEdit")==null) return false;
		return true;
	}
	
	public boolean streetEdit(HttpServletRequest request)
	{
		if(request.getParameter("streetEdit")==null) return false;
		return true;
	}
	
	public boolean houseEdit(HttpServletRequest request)
	{
		if(request.getParameter("houseEdit")==null) return false;
		return true;
	}
}
