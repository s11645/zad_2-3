package find;

import javax.servlet.ServletContext;

public class Attributes {
	
	context.UseContext useContext;	
	
	
	public void setGetContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
	public String findHouse(String username, String adressType)
	{
		String result = null;
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getNumber();
					break;
				}
			}
		}
		return result;
	}
	
	
	public String findStreet(String username, String adressType)
	{
		String result = null;
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getStreet();
					break;
				}
			}
		}
		return result;
	}
	
	
	public String findPostalCode(String username, String adressType)
	{
		String result = null;
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getPostalCode();
					break;
				}
			}
		}
		return result;
	}
	
	
	public String findCity(String username, String adressType)
	{
		String result = null;
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getCity();
					break;
				}
			}
		}
		return result;
	}
	
	
	public String findProvince(String username, String adressType)
	{
		String result = null;
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getProvince();
					break;
				}
			}
		}
		return result;
	}
	
	
	public String findAdressType(String username, String adressType)
	{
		String result = "nic";
		for(unit.Profile profile : useContext.useProfileArray())
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					result=profile.getAdressType();
					break;
				}
			}
		}
		return result;
	}
}
