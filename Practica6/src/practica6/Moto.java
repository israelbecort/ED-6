package practica6;

/**
 * Clase moto.
 * Contiene la información de los coches, contiene la matrícula, el motor, el modelo y el fabricante.
 * Además tiene los siguientes métodos:
 * getMatricula(), getCilindrada(), setMatricul(), setCilindrada().
 * @author Israel Becerra
 * @version 1.1
 */
public class Moto {
	/**
	 * Matrícula de la moto.
	 */
	String matricula;
	/**
	 * Cilindradas de la moto.
	 */
	int cilindrada;

	/**
	 * Constructor vacío.
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	/**
	 * Constructor con parámetros.
	 * @param m 	//Matrícula de la moto.
	 * @param c 	//Cilindradas de la moto.
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	/**
	 * @return //Devuelve la matrícula.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return //Devuelve las cilindradas.
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param m //Nos permite cambiar la matrícula.
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * @param c //Nos permite cambiar las cilindradas.
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
