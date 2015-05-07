package extender;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;


public class Profile {
	
	public ArrayList<unit.Profile> profileArray = new ArrayList<unit.Profile>();
	
	public void newProfile(unit.Profile profile)
	{
		this.profileArray.add(profile);
	}
	
	public void editProfile(HttpServletRequest request, String username, String field)
	{
		for(unit.Profile profile: this.profileArray)
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(request.getParameter("adressTypeEdit")))
				{
					if(field.equals("city"))
					{
						profile.setCity(request.getParameter("cityEdit"));
					}
					else if(field.equals("province"))
					{
						profile.setProvince(request.getParameter("provinceEdit"));
					}
					else if(field.equals("postalCode"))
					{
						profile.setPostalCode(request.getParameter("postalCodeEdit"));
					}
					else if(field.equals("street"))
					{
						profile.setStreet(request.getParameter("streetEdit"));
					}
					else if(field.equals("house"))
					{
						profile.setNumber(request.getParameter("houseEdit"));
					}
					break;
				}
			}
		}
	}
	
	public void removeProfile(String adressType, String username, String field)
	{
		for(unit.Profile profile : profileArray)
		{
			if(profile.getUsername().equals(username))
			{
				if(profile.getAdressType().equals(adressType))
				{
					//zameldowania
					if(field.equals("cityZameldowania"))
					{
						profile.setCity(null);
					}
					else if(field.equals("provinceZameldowania"))
					{
						profile.setProvince(null);
					}
					else if(field.equals("postalCodeZameldowania"))
					{
						profile.setPostalCode(null);
					}
					else if(field.equals("streetZameldowania"))
					{
						profile.setStreet(null);
					}
					else if(field.equals("houseZameldowania"))
					{
						profile.setNumber(null);
					}
					//korespondencyjny
					if(field.equals("cityKorespondencyjny"))
					{
						profile.setCity(null);
					}
					else if(field.equals("provinceKorespondencyjny"))
					{
						profile.setProvince(null);
					}
					else if(field.equals("postalCodeKorespondencyjny"))
					{
						profile.setPostalCode(null);
					}
					else if(field.equals("streetKorespondencyjny"))
					{
						profile.setStreet(null);
					}
					else if(field.equals("houseKorespondencyjny"))
					{
						profile.setNumber(null);
					}
					//pracy
					if(field.equals("cityPracy"))
					{
						profile.setCity(null);
					}
					else if(field.equals("provincePracy"))
					{
						profile.setProvince(null);
					}
					else if(field.equals("postalCodePracy"))
					{
						profile.setPostalCode(null);
					}
					else if(field.equals("streetPracy"))
					{
						profile.setStreet(null);
					}
					else if(field.equals("housePracy"))
					{
						profile.setNumber(null);
					}
					break;
				}
			}
		}
	}

}
