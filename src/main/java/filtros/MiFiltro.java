package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MiFiltro
 */
public class MiFiltro implements Filter {

    /**
     * Default constructor. 
     */
    public MiFiltro() {
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
		// filtra a la ida
		long tiempo1= System.currentTimeMillis();
		chain.doFilter(request, response);
		//filtra a la vuelta
		
		long tiempo2= System.currentTimeMillis();
		HttpServletResponse resp=(HttpServletResponse) response;
		resp.getWriter().println("<h1>El tiempo de carga es: "+(tiempo2-tiempo1)+"</h1>");
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}






