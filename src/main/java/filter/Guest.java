package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Guest
 */
@WebFilter("/1Guest/*")
public class Guest implements Filter {
	FilterConfig fConfig;
    /**
     * Default constructor. 
     */
    public Guest() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if((fConfig.getServletContext().getAttribute("aKtoTo")=="guest")||(fConfig.getServletContext().getAttribute("aKtoTo")==null)) chain.doFilter(request, response);
		else if((fConfig.getServletContext().getAttribute("aKtoTo")=="common")||(fConfig.getServletContext().getAttribute("aKtoTo")=="uncommon")||(fConfig.getServletContext().getAttribute("aKtoTo")=="rare")) request.getRequestDispatcher("/2Common/Profile.jsp").forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig=fConfig;
	}

}
