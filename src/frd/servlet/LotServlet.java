package frd.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.Persistent;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.XMPPServicePb.PresenceResponse.SHOW;
import com.google.apphosting.datastore.DatastoreV4.ContinueQueryRequest;

import frd.model.Lot;
import frd.persistence.LotManager;
import frd.util.DateUtil;

@SuppressWarnings("serial")
public class LotServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		Lot lot = null;
		
		if(req.getParameter("dueDate") != null && req.getParameter("initialAmount") != null && req.getParameter("currentAmount") != null && req.getParameter("product") != null) {

			Date dueDate = DateUtil.getDate(req.getParameter("dueDate"));
			Double initialAmount = new Double( req.getParameter("initialAmount") );
			Double currentAmount = new Double( req.getParameter("currentAmount") );
			Long product = new Long( req.getParameter("product") );

			if( dueDate!=null && initialAmount!=null && currentAmount!=null && product!=null){

				lot = new Lot();
				lot.setCreateDate(new Date());
				lot.setDueDate(dueDate);
				lot.setInitialAmount(initialAmount);
				lot.setCurrentAmount(currentAmount);
				lot.setProduct(product);
				LotManager.save(lot);
			}
		}

		
		List<Lot> lots = LotManager.getAll();
		
		req.setAttribute("lots", lots);
		req.getRequestDispatcher("/lot.jsp").forward(req, resp);
	}
}
