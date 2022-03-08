package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Data;

/**
 * Servlet implementation class PrimerServlet
 */
@Data
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int contador;

    /**
     * Default constructor. 
     */
    public PrimerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texto1=request.getParameter("texto1");
		String texto2=request.getParameter("texto2");
		String texto=texto1+texto2;
		String salida= "<h1>Has escrito "+texto.toUpperCase()+" y tiene "+texto.length()+" letras</h1>";
		response.getWriter().println(salida);
		
		setContador (getContador()+1);
		
		response.getWriter().println("<h1 style='color:#ff0000'>Eres el visitante numero:"+getContador()+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public String dameTexto() {
		return "hola";
	}

}
