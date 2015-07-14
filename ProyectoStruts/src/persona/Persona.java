package persona;
/**
 * 
 */

/**
 * @author Alberto Vivas
 *
 * 
 */
public class Persona {

	private int Edad;
	private String Nombre;
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Persona(int edad, String nombre) {
		Edad = edad;
		Nombre = nombre;
	}
	public Persona(){
		
	}
	
}
