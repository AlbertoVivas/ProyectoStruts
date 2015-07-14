/**
 * 
 */
package practica1.hibernate;

import org.hibernate.Session;

import tablas_Clases.Employees;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class EmpleadoServices {

	
	public static Employees obtenerEmpleadoId(int id){
		Employees empleado=null;
		EmpleadoHibernateDAO eh = new EmpleadoHibernateDAO();
		Session session = SessionManagerHibernate.getSesion();
		EmpleadoHibernateDAO.setSession(session);
		empleado = (Employees) eh.leerEmpleado(id);
		session.close();
		return empleado;
	}
	
}
