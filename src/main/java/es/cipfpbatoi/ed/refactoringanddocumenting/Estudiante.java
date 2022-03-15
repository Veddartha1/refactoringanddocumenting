package es.cipfpbatoi.ed.refactoringanddocumenting;

import java.io.IOException;

/**
 * Modela un <b>alumno</b> con la edad y su nombre
 * <p>
 * Esta clase parte de los requisitos del cliente etc,etc... desripció llarga.
 * </p>
 * 
 * @author Sergi Payà Morales
 *
 */
public class Estudiante implements IComparable{
	
	private static final int MAJORIA_EDAT = 18;
	int edad;
	String nombre;
	
	
	public Estudiante(int e, String n) {
		this.edad = e;
		this.nombre = n;
	}

	@Override
	public int comparaTe( Estudiante e) {
		
		if (this.edad == e.edad){
			return 0;
		} else if (this.edad > e.edad) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * @deprecated
	 * @param edad
	 * @return
	 * @throws IOException ArrayIndex...
	 */
	public static boolean esMayorDeEdad(int edad) throws IOException,ArrayIndexOutOfBoundsException
	{
		return edad >= MAJORIA_EDAT;
	}
	
}
