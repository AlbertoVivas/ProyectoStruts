/**
 * 
 */
package coche;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class CocheAccion extends ActionSupport{

	private Coche coche;
	private final Logger log = LogManager.getRootLogger();
	@Override
	public void validate() {
		log.debug("He entrado en validate");
		if(coche.getMarca().equals("opel")||coche.getMarca().equals("Opel")){
		    addActionError("WTF un OPEL!!!!");
		}
		if(coche.getMatricula().length()!=6){
				addActionError("Matricula incorrecta debe tener 6 caracteres");
			}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date when=null;
		try {
			when = sdf.parse("17/07/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		if(coche.getFecha_compra().after(when)){
			addActionError("es imposible que comprases un coche mañana o despues");
		}
		if(coche.getMarca().equals("Bmw") || coche.getMarca().equals("BMW")|| coche.getMarca().equals("bmw")){
			addActionMessage("Muy bien, tienes un BMW!");
		}
		
	}
	
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
