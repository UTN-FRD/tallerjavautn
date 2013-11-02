package frd.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;


public class DataManager {

	static PersistenceManager pm = PMF.get().getPersistenceManager();
	 
	public static <T> T save(T obj){
		try{
			pm.currentTransaction().begin();
			pm.makePersistent(obj);
			pm.currentTransaction().commit();
		}catch(Exception e){
			pm.currentTransaction().rollback();
		}
		return obj;
	}
	
	public static <T> void remove(T obj){
		pm.deletePersistent( obj );
	}

	public static <T> Boolean remove(Class<T> objClass, Long id){
		T obj = pm.getObjectById( objClass, id );
		if ( obj != null ){
			pm.deletePersistent( obj );
			return true;
		} else {
			return false;
		}
		
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getAll(Class<T> objClass) {
		Query q = pm.newQuery(objClass);
		List<T> results = null;
		try {
			results = new ArrayList<T>();
			for(T o : (List<T>) q.execute()){
				results.add( pm.detachCopy(o) );
			}
		} finally {
			q.closeAll();
		}
		
		return results;
	}

}
