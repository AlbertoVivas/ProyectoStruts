/**
 * 
 */
package empleadoJPADAO;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import empleado.Employee;
import interfaceRecuperable.Recuperable;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class EmpleadoJPADAO implements Recuperable {

	/* (non-Javadoc)
	 * @see interfaceRecuperable.Recuperable#leerEmpleado(int)
	 */
	@Override
	public Object leerEmpleado(int id) throws SQLException {
		Employee employee = null;
		
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidadEmpleados");
        EntityManager em = emf.createEntityManager();
        Long id_long =new Long(id);
        try {
        em.getTransaction().begin();
        employee = em.find(Employee.class, id_long);
        //em.persist(employee);
        em.getTransaction().commit();
        } catch (Exception e) {
        
        e.printStackTrace();
        }finally {
        em.close();
        emf.close();
        //System.exit(0);//no sé pporqué no acaba sólo...parace que se queda conlgando si no le pongo esto
        }
		return employee;
	}

}
