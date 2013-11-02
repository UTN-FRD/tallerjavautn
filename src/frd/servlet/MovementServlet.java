package frd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MovementServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// Servlet para ABM de movimientos
		// 1- si vienen par�metros no nulos del objeto, quiere decir que:
		//       a- si el id es nulo se est� agregando uno nuevo
		//       b- si el id no es nulo se est� modificando
		// 2- si viene solo el par�metro id, se est� eliminando el objeto
		// 3- siempre se debe completar la lista con todos los objetos en la base, para mostrar la tabla
		
		req.getRequestDispatcher("/movement.jsp").forward(req, resp);
	}
}
