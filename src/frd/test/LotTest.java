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

import frd.model.Lot;
import frd.persistence.LotManager;
import frd.persistence.PMF;
import frd.persistence.ProductManager;

public class LotTest extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter writter = resp.getWriter();
		writter.println("Inicio test de Producto\n");

		PersistenceManager pm = PMF.get().getPersistenceManager();

		//crear nuevo lote
		Lot lot = new Lot();
		lot.setCreateDate(new Date());
		lot.setDueDate(new Date());
		//pm.makePersistent(lot);
		LotManager.save(lot);
		writter.println( lot.getCreateDate() + " - "+ lot.getDueDate());
		
		//prod = new Product();
		//prod.setName("PRUEBA ProductManager");
		//prod.setDescription("creado el "+new Date());
		//ProductManager.save(prod);
		//writter.println( prod.getName() + " - "+ prod.getId());

		writter.println("\nLista de Lotes\n");
		//listar todos
		List<Lot> lotes = LotManager.getAll();
		for(Lot l : lotes){
			writter.println( l.getCreateDate()+ "-" + l.getDueDate()) ;
		}
		
		writter.println("\nLote de prueba borrado\n");
		ProductManager.remove( lot );
		//pm.deletePersistent(lot);
		writter.println("\nLista de Lotes\n");
		List<Lot> lote2 = LotManager.getAll();
		for(Lot l : lote2){
			writter.println( l.getCreateDate()+ "-" + l.getDueDate()) ;
		}
	}	 
}
