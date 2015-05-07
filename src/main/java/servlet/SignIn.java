package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	extender.SignIn signInExtender = new extender.SignIn();
	acl.SignIn signInAcl = new acl.SignIn();
	find.SignIn signInFind = new find.SignIn();
       
    public SignIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		context.AddContext addContext = new context.AddContext(getServletContext());
		context.UseContext useContext = new context.UseContext(getServletContext());
		
		addContext.addSignInUsername(request);
		
		signInFind.setUseContext(getServletContext());
		
		if(signInFind.findRare(request.getParameter("username"))) addContext.addAKtoTo("rare");
		else if(signInFind.findUncommon(request.getParameter("username"))) addContext.addAKtoTo("uncommon");
		else addContext.addAKtoTo("common");
		
		signInAcl.setUseContext(getServletContext());
		
		signInExtender.setSignUpArray(useContext.useSignUpArray());
		
		if(signInAcl.subsist(request)){
			if(signInAcl.accomplished(request)){
				response.sendRedirect("2Common/Gownosci/Fag.jsp");
			}
			else response.sendRedirect("2Common/Gownosci/Accomplished.jsp");
		}
		else response.sendRedirect("2Common/Gownosci/Subsist.jsp");
	}
}
