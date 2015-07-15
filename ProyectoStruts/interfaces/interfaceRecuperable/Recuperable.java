/**
 * 
 */
package interfaceRecuperable;

import java.sql.SQLException;

/**
 * @author Alberto Vivas
 *
 * 
 */
public interface Recuperable {
	Object leerEmpleado(int id) throws SQLException;
}
