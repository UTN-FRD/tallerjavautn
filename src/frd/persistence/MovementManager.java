package frd.persistence;

import java.util.ArrayList;
import java.util.List;

import frd.model.Movement;

public class MovementManager extends DataManager {

	public static List<Movement> getAll() {
		//TODO: devolver todos los movimientos persistidos en el datastore
		return DataManager.getAll(Movement.class);			
	}
	
	public static boolean remove( Long id ){
		Movement m = pm.getObjectById( Movement.class, id );
		if ( m != null ) {
			DataManager.remove( m );
			return true;
		}
		else {
			return false;
		}
	}
	
}
