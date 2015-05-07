package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Attributes")
public class Attributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	extender.Profile profileExtender = new extender.Profile();
	acl.Attributes attributesAcl = new acl.Attributes();
	find.Attributes attributesFind = new find.Attributes();
       
    public Attributes() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		attributesFind.setGetContext(getServletContext());
		
		context.AddContext addContext = new context.AddContext(getServletContext());
		context.UseContext useContext = new context.UseContext(getServletContext());
		
		addContext.addProfileArray(profileExtender);
		attributesAcl.setUseContext(getServletContext());
		
		if(attributesAcl.adressTypeNull(request))
		{
			if(attributesAcl.usernameAdressType(useContext.useSignInUsername(), request, profileExtender.profileArray))
			{
				attributesAcl.setUseContext(getServletContext());
				if(attributesAcl.usernameNotSubsist(useContext.useSignInUsername()))
				{
					unit.Profile profile = new unit.Profile(useContext.useSignInUsername(), request);
					profileExtender.newProfile(profile);
				}
				else response.sendRedirect("Normal/LessImportantJSP/UsernameNotExists.jsp");
			}
		}
		
		//edit
		if(attributesAcl.editNull(request))
		{
			if(attributesAcl.provinceEdit(request))
			{
				profileExtender.editProfile(request, useContext.useSignInUsername(), "province");
			}
			else if(attributesAcl.cityEdit(request))
			{
				profileExtender.editProfile(request, useContext.useSignInUsername(), "city");
			}
			else if(attributesAcl.postalCodeEdit(request))
			{
				profileExtender.editProfile(request, useContext.useSignInUsername(), "postalCode");
			}
			else if(attributesAcl.streetEdit(request))
			{
				profileExtender.editProfile(request,useContext.useSignInUsername() , "street");
			}
			else if(attributesAcl.houseEdit(request))
			{
				profileExtender.editProfile(request, useContext.useSignInUsername(), "house");
			}
		}
		
		
		//delete
		if(getServletContext().getAttribute("delete")!=null)
		{
			//zameldowania
			if(getServletContext().getAttribute("delete").equals("postalCodeZameldowania"))
			{
				profileExtender.removeProfile("zameldowania", useContext.useSignInUsername(), "postalCodeZameldowania");
			}
			else if(getServletContext().getAttribute("delete").equals("cityZameldowania"))
			{
				profileExtender.removeProfile("zameldowania", useContext.useSignInUsername(), "cityZameldowania");
			}
			else if(getServletContext().getAttribute("delete").equals("houseZameldowania"))
			{
				profileExtender.removeProfile("zameldowania",useContext.useSignInUsername(), "houseZameldowania");
			}
			else if(getServletContext().getAttribute("delete").equals("streetZameldowania"))
			{
				profileExtender.removeProfile("zameldowania",useContext.useSignInUsername(), "streetZameldowania");
			}
			else if(getServletContext().getAttribute("delete").equals("provinceZameldowania"))
			{
				profileExtender.removeProfile("zameldowania",useContext.useSignInUsername(), "provinceZameldowania");
			}
			//korespondencyjny
			if(getServletContext().getAttribute("delete").equals("postalCodeKorespondencyjny"))
			{
				profileExtender.removeProfile("korespondencyjny", useContext.useSignInUsername(), "postalCodeKorespondencyjny");
			}
			else if(getServletContext().getAttribute("delete").equals("cityKorespondencyjny"))
			{
				profileExtender.removeProfile("korespondencyjny",useContext.useSignInUsername(), "cityKorespondencyjny");
			}
			else if(getServletContext().getAttribute("delete").equals("houseKorespondencyjny"))
			{
				profileExtender.removeProfile("korespondencyjny", useContext.useSignInUsername(), "houseKorespondencyjny");
			}
			else if(getServletContext().getAttribute("delete").equals("streetKorespondencyjny"))
			{
				profileExtender.removeProfile("korespondencyjny", useContext.useSignInUsername(), "streetKorespondencyjny");
			}
			else if(getServletContext().getAttribute("delete").equals("provinceKorespondencyjny"))
			{
				profileExtender.removeProfile("korespondencyjny", useContext.useSignInUsername(), "provinceKorespondencyjny");
			}
			//pracy
			if(getServletContext().getAttribute("delete").equals("postalCodePracy"))
			{
				profileExtender.removeProfile("pracy", useContext.useSignInUsername(), "postalCodePracy");
			}
			else if(getServletContext().getAttribute("delete").equals("cityPracy"))
			{
				profileExtender.removeProfile("pracy",useContext.useSignInUsername(), "cityPracy");
			}
			else if(getServletContext().getAttribute("delete").equals("housePracy"))
			{
				profileExtender.removeProfile("pracy", useContext.useSignInUsername(), "housePracy");
			}
			else if(getServletContext().getAttribute("delete").equals("streetPracy"))
			{
				profileExtender.removeProfile("pracy", useContext.useSignInUsername(), "streetPracy");
			}
			else if(getServletContext().getAttribute("delete").equals("provincePracy"))
			{
				profileExtender.removeProfile("pracy", useContext.useSignInUsername(), "provincePracy");
			}
			getServletContext().setAttribute("delete", null);
		}
		addContext.attributes(request, useContext, attributesFind);
		
		
		
		getServletContext().getRequestDispatcher("/2Common/Attributes.jsp").forward(request, response);
		
	}
}
