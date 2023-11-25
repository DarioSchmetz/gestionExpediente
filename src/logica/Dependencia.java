package logica;

public class Dependencia {

	private long codigo;
	private String descripcion;

	public Dependencia() {

	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String mostrarDependencia(String descripcion) {

		//Esto hiciste vos, te lo dejo escrito para que te des cuenta del error:
//		String pasarMayuscula = descripcion + codigo;
//    	System.out.println (pasarMayuscula.toLowerCase() + codigo);
//		return pasarMayuscula;
		
		/* Para pasar a mayusculas se utiliza el metodo "toUpperCase()" y para
		 * pasar a minusculas se utiliza el metodo "toLowerCase()". */
		return descripcion.toUpperCase() + codigo;
	}
}
//4.7.	Declarar en la clase Dependencia un método llamado mostrarDependencia( ), 
//que retorne un String que contenga
//el codigo concatenado con la descripcion de la dependencia, transformado a mayúscula.