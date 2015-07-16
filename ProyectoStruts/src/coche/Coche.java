/**
 * 
 */
package coche;

import java.util.Date;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class Coche {

	private String marca;
	private String modelo;
	private String matricula;
	private Date fecha_compra;
	private int potencia;
	private float cc;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public float getCc() {
		return cc;
	}
	public void setCc(float cc) {
		this.cc = cc;
	}
	public Coche(String marca, String modelo, String matricula, Date fecha_compra, int potencia, float cc) {
	//public Coche(String marca, String modelo, String matricula, int potencia, float cc) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.fecha_compra = fecha_compra;
		this.potencia = potencia;
		this.cc = cc;
	}

	public Coche(String marca) {
		this.marca=marca;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String resp="";
			resp+="Marca: "+marca;
			resp+=" Modelo: "+modelo;
			resp+=" Matricula: "+matricula;
			resp+=" Fecha de compra: "+fecha_compra;
			resp+=" Potencia: "+potencia;
			resp+=" CC: "+cc;
		return resp;
	}
	
}
