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
public class PersonaAction extends ActionSupport{

	private Persona persona;
	
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
		persona = new Persona();
		persona.setNombre("kk");
		persona.setEdad(55);
		return SUCCESS;
	}
}
