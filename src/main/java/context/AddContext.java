package context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class AddContext {
	
	private ServletContext context;
	
	public AddContext(ServletContext context) {
		super();
		this.context=context;
	}
	
	public void addSignUpArray(extender.SignUp singUp)
	{
		context.setAttribute("SignUpArray", singUp.signUpArray);
	}
	
	public void addSignInUsername(HttpServletRequest request)
	{
		context.setAttribute("SignInUsername", request.getParameter("username"));
	}
	
	public void addAKtoTo(String username)
	{
		context.setAttribute("aKtoTo", username);
	}
	
	public void addProfileArray(extender.Profile profile)
	{
		context.setAttribute("ProfileArray", profile.profileArray);
	}
	
	public void attributes(HttpServletRequest request, context.UseContext useContext, find.Attributes attributesFind)
	{
		//zameldowania
		request.setAttribute("adressTypeZameldowania", attributesFind.findAdressType(useContext.useSignInUsername(), "zameldowania"));
		request.setAttribute("provinceZameldowania", attributesFind.findProvince(useContext.useSignInUsername(), "zameldowania"));
		request.setAttribute("cityZameldowania", attributesFind.findCity(useContext.useSignInUsername(), "zameldowania"));
		request.setAttribute("postalCodeZameldowania", attributesFind.findPostalCode(useContext.useSignInUsername(), "zameldowania"));
		request.setAttribute("streetZameldowania", attributesFind.findStreet(useContext.useSignInUsername(), "zameldowania"));
		request.setAttribute("houseZameldowania", attributesFind.findHouse(useContext.useSignInUsername(), "zameldowania"));
		//korespondencyjny
		request.setAttribute("adressTypeKorespondencyjny", attributesFind.findAdressType(useContext.useSignInUsername(), "korespondencyjny"));
		request.setAttribute("provinceKorespondencyjny", attributesFind.findProvince(useContext.useSignInUsername(), "korespondencyjny"));
		request.setAttribute("cityKorespondencyjny", attributesFind.findCity(useContext.useSignInUsername(), "korespondencyjny"));
		request.setAttribute("postalCodeKorespondencyjny", attributesFind.findPostalCode(useContext.useSignInUsername(), "korespondencyjny"));
		request.setAttribute("streetKorespondencyjny",  attributesFind.findStreet(useContext.useSignInUsername(), "korespondencyjny"));
		request.setAttribute("houseKorespondencyjny", attributesFind.findHouse(useContext.useSignInUsername(), "korespondencyjny"));
		//pracy
		request.setAttribute("adressTypePracy", attributesFind.findAdressType(useContext.useSignInUsername(), "pracy"));
		request.setAttribute("provincePracy", attributesFind.findProvince(useContext.useSignInUsername(), "pracy"));
		request.setAttribute("cityPracy", attributesFind.findCity(useContext.useSignInUsername(), "pracy"));
		request.setAttribute("postalCodePracy",attributesFind.findPostalCode(useContext.useSignInUsername(), "pracy"));
		request.setAttribute("streetPracy",  attributesFind.findStreet(useContext.useSignInUsername(), "pracy"));
		request.setAttribute("housePracy", attributesFind.findHouse(useContext.useSignInUsername(), "pracy"));
	}
}
