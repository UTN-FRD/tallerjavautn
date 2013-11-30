package frd.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frd.model.Lot;
import frd.persistence.LotManager;
import frd.util.DateUtil;

@SuppressWarnings("serial")
public class LotServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		Lot lot = null;
		Long productId = new Long( req.getParameter("productId") );
		
		if(req.getParameter("dueDate") != null && req.getParameter("initialAmount") != null ) {

			Date dueDate = DateUtil.getDate4Input(req.getParameter("dueDate"));
			Double initialAmount = new Double( req.getParameter("initialAmount") );

			if( dueDate!=null && initialAmount!=null && productId!=null){

				lot = new Lot();
				lot.setCreateDate(new Date());
				lot.setDueDate(dueDate);
				lot.setInitialAmount(initialAmount);
				lot.setCurrentAmount(initialAmount);
				lot.setProduct(productId);
				LotManager.save(lot);
			}
			
		}
		
		List<Lot> lots = null;

		lots = LotManager.getByProductId( productId );
		
		req.setAttribute("lots", lots);
		req.getRequestDispatcher("/lot.jsp").forward(req, resp);
	}
}
