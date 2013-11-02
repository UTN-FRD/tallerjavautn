package frd.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frd.model.Movement;
import frd.persistence.MovementManager;
import frd.persistence.PMF;
import frd.persistence.ProductManager;

public class MovementTest extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter writter = resp.getWriter();
		writter.println("Inicio test de Producto\n");

		PersistenceManager pm = PMF.get().getPersistenceManager();

		//crear nuevo movimiento
		Movement mov = new Movement();
		mov.setDate(new Date());
		mov.setDescription(" PuRo MoViMiEnTo ");
		//pm.makePersistent(lot);
		MovementManager.save(mov);
		writter.println( mov.getDate() + " - "+ mov.getDescription());
		
		//prod = new Product();
		//prod.setName("PRUEBA ProductManager");
		//prod.setDescription("creado el "+new Date());
		//ProductManager.save(prod);
		//writter.println( prod.getName() + " - "+ prod.getId());

		writter.println("\nLista de Descripciones\n");
		//listar todos
		List<Movement> movimiento = MovementManager.getAll();
		for(Movement m : movimiento){
			writter.println( m.getDate()+ "-" + m.getDescription()) ;
		}
		
		writter.println("\nMovimiento de prueba borrado\n");
		ProductManager.remove( mov );
		//pm.deletePersistent(lot);
		writter.println("\nLista de movimientos\n");
		List<Movement> movimiento2 = MovementManager.getAll();
		for(Movement m : movimiento2){
			writter.println( m.getDate()+ "-" + m.getDescription()) ;
		}
	}	 
}
