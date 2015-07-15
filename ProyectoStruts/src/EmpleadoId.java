import com.opensymphony.xwork2.ActionSupport;

import Empleados.EmployeesServices;
import empleadoHibernateDAO.EmpleadoHibernateDAO;
import interfaceRecuperable.Recuperable;
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
		EmployeesServices es = new EmployeesServices();
		Recuperable emp_hiber = new EmpleadoHibernateDAO();
		es.setRecuperable(emp_hiber);
		empleado = (Employees) es.leerEmpleado(id);
		return SUCCESS;
	}
	
	
}
