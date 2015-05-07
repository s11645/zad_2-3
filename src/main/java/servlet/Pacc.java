package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pacc")
public class Pacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	extender.Pacc pacc = new extender.Pacc();
       
    public Pacc() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("badUsername")==null){
			if(pacc.premium(request.getParameter("newUsername"), getServletContext())) response.sendRedirect("4Rare/Gownosci/Premium.jsp");
			else response.sendRedirect("4Rare/Gownosci/BadUsername.jsp");
		}
		else if(request.getParameter("addUsername")==null){
			if(pacc.badPremium(request.getParameter("badUsername"), getServletContext())) response.sendRedirect("4Rare/Gownosci/BadPremium.jsp");
			else response.sendRedirect("4Rare/Gownosci/BadUsername.jsp");
		}
		
	}
}
