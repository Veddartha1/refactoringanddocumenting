package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Interfaz para comparar Estudiantes
 * 
 * @author sergi
 *
 */
public interface IComparable {
	
	/**
	 * Metodo para comparar con un estudiante
	 * 
	 * @param e Estudiante a comparar 
	 * 
	 * @return 0 Si son iguales, 1 si el actual es mayor y -1 si el actual es menor
	 */
	int comparaTe(Estudiante e);

}