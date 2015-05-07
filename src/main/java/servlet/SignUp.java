package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	extender.SignUp signUpExtender = new extender.SignUp();
	acl.SignUp signUpAcl = new acl.SignUp();
	find.SignUp signUpFind = new find.SignUp();
       
    public SignUp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		context.AddContext addContext = new context.AddContext(getServletContext());
		addContext.addSignUpArray(signUpExtender);
		
		signUpFind.setUseContext(getServletContext());
		if(signUpFind.findUsername("rare")){
			signUpExtender.newAdmin();
		}
		
		signUpAcl.setUseContext(getServletContext());
		if(signUpAcl.subsist(request)){
			if(signUpAcl.accomplished(request)){
				if(signUpAcl.facilePassword(request)){
					
					unit.SignUp signUp = new unit.SignUp(request);
					signUpExtender.add(signUp);
					response.sendRedirect("1Guest/Gownosci/Fag.jsp");
					
				}
				else response.sendRedirect("1Guest/Gownosci/Facile.jsp");
			}
			else response.sendRedirect("1Guest/Gownosci/Accomplished.jsp");
		}
		else response.sendRedirect("1Guest/Gownosci/Subsist.jsp");	
	}
}
