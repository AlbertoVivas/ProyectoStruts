/**
 * 
 */
package coche;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class CocheAccion extends ActionSupport{

	private Coche coche;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	@TypeConversion(converter="coche.ConversorCoche")
	public void setCoche(Coche coche){
		this.coche=coche;
	}
	
	@TypeConversion(converter="coche.ConversorCoche")
	public Coche getCoche(){
		return coche;
	}
}
