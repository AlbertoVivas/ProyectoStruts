/**
 * 
 */
package mainsEmpleados;

import java.sql.SQLException;

import Empleados.EmployeesServices;


import jdbc_DAO_DTO.EmpleadoDTO;
import session.SessionManager;
import tablas_Clases.Employees;
import interfaceRecuperable.Recuperable;
import empleado.Employee;
import empleadoHibernateDAO.EmpleadoHibernateDAO;
import empleadoJDBDAO.EmpleadoJDBDAO;
import empleadoJPADAO.EmpleadoJPADAO;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class main {

	public static void main(String[] args) throws SQLException {
		int id = 150;
		try{
		EmployeesServices es = new EmployeesServices();
		
		Recuperable emp_hiber = new EmpleadoHibernateDAO();
		es.setRecuperable(emp_hiber);
		System.out.println(es.leerEmpleado(id));
		
		Recuperable emp_jdb = new EmpleadoJDBDAO();
		es.setRecuperable(emp_jdb);
		System.out.println(es.leerEmpleado(id));
		
		
		Recuperable emp_jpa = new EmpleadoJPADAO();
		es.setRecuperable(emp_jpa);
		System.out.println(es.leerEmpleado(id));
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			SessionManager.closeFactory();
		}
		
	}
}
