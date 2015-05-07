package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountList")
public class AccountList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	extender.AccountList accList = new extender.AccountList();

    public AccountList() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		accList.setUseContext(getServletContext());
		request.setAttribute("accountList", accList.getAccountList());
		getServletContext().getRequestDispatcher("/2Common/AccountList.jsp").forward(request, response);
	}
}
