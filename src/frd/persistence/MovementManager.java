package frd.persistence;

import java.util.ArrayList;
import java.util.List;

import frd.model.Lot;
import frd.model.Movement;

public class MovementManager extends DataManager {

	public static List<Movement> getAll() {
		//TODO: devolver todos los movimientos persistidos en el datastore
		return DataManager.getAll(Movement.class);			
	}
	
	public static Boolean remove( Long id ) {
		return DataManager.remove( Movement.class, id );
		
	}
	
}
