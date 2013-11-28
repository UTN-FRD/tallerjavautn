package frd.servlet;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.datanucleus.util.StringUtils;

import frd.model.Product;
import frd.persistence.PMF;
import frd.persistence.ProductManager;

@SuppressWarnings("serial")
public class ProductServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PersistenceManager pm =PMF.get().getPersistenceManager();
		Product prod = null;
	    String id = req.getParameter("productId");
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
			if( !StringUtils.isEmpty(id) )
				{
					try
					{
						Product p= pm.getObjectById(Product.class,new Long( id) );
						p.setName(name);
						p.setDescription(description);
					}
					finally
					{
						pm.close();
					}
				}
			else
				{
				prod.setName(name);
				prod.setDescription(description);
				ProductManager.save(prod);	
				}
			
		}

		List<Product> products = ProductManager.getAll();
		
		req.setAttribute("products", products);
		req.getRequestDispatcher("/product.jsp").forward(req, resp);
	}
}
