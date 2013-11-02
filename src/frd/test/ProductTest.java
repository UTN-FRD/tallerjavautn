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

import frd.model.Product;
import frd.persistence.DataManager;
import frd.persistence.PMF;
import frd.persistence.ProductManager;

public class ProductTest extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter writter = resp.getWriter();
		writter.println("Inicio test de Producto\n");

		PersistenceManager pm = PMF.get().getPersistenceManager();

		//crear nuevo producto local
		Product prod = new Product();
		prod.setName("Producto de PRUEBA");
		prod.setDescription("creado el "+new Date());
		//pm.makePersistent(prod);
		ProductManager.save(prod);
		writter.println( prod.getName() + " - "+ prod.getId());
		
		//prod = new Product();
		//prod.setName("PRUEBA ProductManager");
		//prod.setDescription("creado el "+new Date());
		//ProductManager.save(prod);
		//writter.println( prod.getName() + " - "+ prod.getId());

		writter.println("\nLista de Productos\n");
		//listar todos
		List<Product> productos = ProductManager.getAll();
		for(Product p : productos){
			writter.println( p.getName()+ "-" + p.getId()) ;
		}
		
		writter.println("\nProducto de prueba borrado\n");
		ProductManager.remove( prod );
		//pm.deletePersistent(prod);
		writter.println("\nLista de Productos\n");
		List<Product> productos2 = ProductManager.getAll();
		for(Product p : productos2){
			writter.println( p.getName()+ "-" + p.getId()) ;
		}
	}	 
}