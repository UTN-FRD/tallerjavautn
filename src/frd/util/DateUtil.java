package frd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date getDate( String texto ){
	
		Date result = null;
		
		try{
			result = df.parse( texto );
		}catch(Exception e){}
		
		return result;
	}
}
