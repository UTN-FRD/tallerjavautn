package frd.persistence;

import java.util.List;

import frd.model.Lot;

public class LotManager extends DataManager {

	public static List<Lot> getAll() {
		//TODO: devolver todos los lotes persistidos en el datastore
		return DataManager.getAll( Lot.class );
	}
	
	public static Boolean remove( Long id ) {
		Lot l = pm.getObjectById( Lot.class, id );
		if ( l != null ) {
			DataManager.remove( l );
			return true;
		}
		else {
			return false;
		}
		
	}

}
