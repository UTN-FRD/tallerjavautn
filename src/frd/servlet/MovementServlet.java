package frd.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frd.model.Movement;
import frd.persistence.LotManager;
import frd.persistence.MovementManager;
import frd.util.DateUtil;

@SuppressWarnings("serial")
public class MovementServlet extends HttpServlet {
	 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Movement move = null;
				
		if((req.getParameter("cantidad") != null) && (req.getParameter("date") != null) && (req.getParameter("description") != null) ){
			Long cantidad = new Long ( req.getParameter("cantidad") );
			String description = req.getParameter("description");
			Date date = DateUtil.getDate4Input(req.getParameter("date"));
			Long lotId = Long.parseLong( req.getParameter("lotId") );
			
			move = new Movement();
			move.setCantidad(cantidad);
			move.setDescription(description);
			move.setDate(date);
			move.setLotId( lotId );
			MovementManager.save(move);
			
			LotManager.updateAmount( lotId, cantidad );
		}
		
		String idParam = req.getParameter("lotId");
		System.out.println(idParam);
		
		Long id = new Long( idParam );
		
		List<Movement> movements = MovementManager.listaMovement(id);
	
		req.setAttribute("movements", movements);
		req.getRequestDispatcher("/movement.jsp").forward(req, resp);
		
		// Servlet para ABM de movimientos
		// 1- si vienen par�metros no nulos del objeto, quiere decir que:
		//       a- si el id es nulo se est� agregando uno nuevo
		//       b- si el id no es nulo se est� modificando
		// 2- si viene solo el par�metro id, se est� eliminando el objeto
		// 3- siempre se debe completar la lista con todos los objetos en la base, para mostrar la tabla
	}
}
