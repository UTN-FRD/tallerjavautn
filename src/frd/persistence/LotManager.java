package frd.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Query;

import frd.model.Lot;

public class LotManager extends DataManager {

	public static List<Lot> getAll() {
		//TODO: devolver todos los lotes persistidos en el datastore
		return DataManager.getAll( Lot.class );
	}
	
	public static Boolean remove( Long id ) {
		return DataManager.remove( Lot.class, id);
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<Lot> getByProductId( Long prodId ){
		Query q = pm.newQuery(Lot.class);
		q.setFilter( "product == :param" );
		List<Lot> results = null;
		try {
			results = new ArrayList<Lot>();
			for( Lot l : (List<Lot>) q.execute( prodId ) ){
				results.add( pm.detachCopy( l ) );
			}
		} finally {
			q.closeAll();
		}
		
		return results;
		
	}

	public static void updateAmount(Long lotId, Long cantidad) {
		Lot lot = pm.getObjectById(Lot.class, lotId);
		lot.setCurrentAmount( lot.getCurrentAmount()-cantidad );
	}

}
