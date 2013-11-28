package frd.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import frd.model.Lot;
import frd.model.Product;

public class ProductManager extends DataManager {

	public static List<Product> getAll() {
		return DataManager.getAll(Product.class);
		//return new ArrayList<Product>();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Product> getAllExpired(){
		
		List<Product> ret = new ArrayList<Product>();
		List<Lot> results = null;
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Query query = pm.newQuery(Lot.class);
		query.declareImports("import java.util.Date");
		query.declareParameters("Long productId, Date hoy");
		query.setFilter("product == productId & dueDate < hoy");
		
		Date date = new Date();
		Long productId = null;
		
		for(Product producto : ProductManager.getAll()){
			
			try{
				
				productId = producto.getId();
				
				results = (List<Lot>) query.execute(productId, date);
				
			}catch(Exception ex){
				
				ex.printStackTrace();
			}
			
			if(results.size() > 0){
				
				ret.add(producto);
			}
			
		}
		
		query.closeAll();
	
		return ret;
		
	}
			
	public static List<Product> getByProductUserMail( String userMail ){
		Query q = pm.newQuery(Product.class);
		q.setFilter("userMail== :param");
		List<Product> results = null;
		try {
			results = (List<Product>) q.execute(userMail);
			
		} finally {
			q.closeAll();
		}
		
		return results;
		
	}

}
