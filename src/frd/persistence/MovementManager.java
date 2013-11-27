package frd.persistence;

import java.util.List;

import javax.jdo.Query;

import frd.model.Movement;

public class MovementManager extends DataManager {

	
	
	
	public static List<Movement> listaMovement(Long id) {
		Query q = pm.newQuery( Movement.class );
		q.setFilter("lotId == "+id);
		return (List<Movement>) q.execute();
	}
	
	public static List<Movement> getAll() {
		//TODO: devolver todos los movimientos persistidos en el datastore
		return DataManager.getAll(Movement.class);			
	}
	
	public static Boolean remove( Long id ) {
		return DataManager.remove( Movement.class, id );
		
	}
	
}
