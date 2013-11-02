package frd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import frd.model.Product;
import frd.persistence.ProductManager;

@SuppressWarnings("serial")
public class ProductServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Product prod = null;
	    String id = req.getParameter("id");
		String name = req.getParameter("name");
		String description = req.getParameter("description");
	
		if (name==null && description==null) {
			if( id==null ){
				//no hay modificacion. muestro lista de productos
			}else{
				ProductManager.remove(prod);
			}
		}else{
			prod = new Product();
			if( id!=null )
				prod.setId( new Long(id) );
			prod.setName(name);
			prod.setDescription(description);
			ProductManager.save(prod);
		}

		List<Product> products = ProductManager.getAll();
		
		req.setAttribute("products", products);
		req.getRequestDispatcher("/product.jsp").forward(req, resp);
	}
}
