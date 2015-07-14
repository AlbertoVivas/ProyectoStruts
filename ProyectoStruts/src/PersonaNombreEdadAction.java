import com.opensymphony.xwork2.ActionSupport;

import persona.Persona;

/**
 * 
 */

/**
 * @author Alberto Vivas
 *
 * 
 */
public class PersonaNombreEdadAction extends ActionSupport{
	
	private Persona persona;
	private String Nombre;
	private int Edad;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		persona = new Persona(Edad, Nombre);
		return SUCCESS;
	}
	
}
