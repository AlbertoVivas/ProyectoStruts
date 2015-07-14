import com.opensymphony.xwork2.ActionSupport;

import practica1.hibernate.EmpleadoServices;
import tablas_Clases.Employees;

/**
 * 
 */

/**
 * @author Alberto Vivas
 *
 * 
 */
public class EmpleadoId extends ActionSupport{

	private Employees empleado;
	private int id;
	
	
	
	public Employees getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Employees empleado) {
		this.empleado = empleado;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		empleado = EmpleadoServices.obtenerEmpleadoId(id);
		return SUCCESS;
	}
	
	
}
