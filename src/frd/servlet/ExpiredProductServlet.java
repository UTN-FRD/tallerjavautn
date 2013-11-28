package frd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import frd.model.Product;
import frd.persistence.ProductManager;

@SuppressWarnings("serial")
public class ExpiredProductServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		List<Product> products = ProductManager.getAllExpired();
		
		req.setAttribute("products", products);
		req.getRequestDispatcher("/expiredProducts.jsp").forward(req, resp);
	}
}
