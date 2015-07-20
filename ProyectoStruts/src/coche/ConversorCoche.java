/**
 * 
 */
package coche;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class ConversorCoche extends StrutsTypeConverter{

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map, java.lang.String[], java.lang.Class)
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		String marca = arg1[0];
		String modelo = arg1[1];
		String matricula = arg1[2];
		int potencia = Integer.parseInt(arg1[4]);
		float cc = Float.parseFloat(arg1[5]);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date fecha_compra = null;
		try {
			fecha_compra = sdf.parse(arg1[3]);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		Coche coche = new Coche(marca, modelo, matricula, fecha_compra, potencia, cc);
		return coche;
		
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map, java.lang.Object)
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		Coche coche = (Coche)arg1;
		return coche.toString();	
	}
	
	

}
