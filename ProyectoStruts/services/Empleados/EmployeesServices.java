/**
 * 
 */
package Empleados;

import java.sql.SQLException;

import interfaceRecuperable.Recuperable;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class EmployeesServices {
	private Recuperable obj_dao;
	
	public void setRecuperable(Recuperable obj_dao){
		this.obj_dao=obj_dao;
	}
	
	public Object leerEmpleado(int id) throws SQLException{
		return obj_dao.leerEmpleado(id);
	}
	
}
