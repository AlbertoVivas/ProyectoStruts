package empleadoHibernateDAO;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import session.SessionManager;
import tablas_Clases.Employees;
import interfaceRecuperable.Recuperable;

/**
 * 
 */

/**
 * @author Alberto Vivas
 *
 * 
 */
public class EmpleadoHibernateDAO implements Recuperable {

	/* (non-Javadoc)
	 * @see interfaceRecuperable.Recuperable#leerEmpleado(int)
	 */
	@Override
	public Object leerEmpleado(int id) {
		Session session =null;
		Employees empleado = null;
		Transaction trans = null;
		try{		
		session =  SessionManager.obtenerSession();	
		trans = session.beginTransaction();
		empleado= (Employees) session.get(Employees.class, id);
		}catch(Exception e){
			e.printStackTrace();
			trans.rollback();
		}finally{
			SessionManager.disconectSession(session);
		}
		return empleado;
	}

}
