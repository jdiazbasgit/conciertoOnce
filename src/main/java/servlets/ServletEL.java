package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@WebServlet("/ServletEL")
public class ServletEL extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> nombres= new ArrayList<>();
		for(int i=0;i<20;i++) {
			nombres.add("pepe"+i);
		}
		request.setAttribute("nombres", nombres);
		getServletContext().getRequestDispatcher("/jspEL.jsp").forward(request, response);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
