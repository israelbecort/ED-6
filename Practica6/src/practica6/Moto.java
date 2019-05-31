package practica6;

/**
 * Clase moto.
 * Contiene la informaci�n de los coches, contiene la matr�cula, el motor, el modelo y el fabricante.
 * Adem�s tiene los siguientes m�todos:
 * getMatricula(), getCilindrada(), setMatricul(), setCilindrada().
 * @author Israel Becerra
 * @version 1.1
 */
public class Moto {
	/**
	 * Matr�cula de la moto.
	 */
	String matricula;
	/**
	 * Cilindradas de la moto.
	 */
	int cilindrada;

	/**
	 * Constructor vac�o.
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	/**
	 * Constructor con par�metros.
	 * @param m 	//Matr�cula de la moto.
	 * @param c 	//Cilindradas de la moto.
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	/**
	 * @return //Devuelve la matr�cula.
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
	 * @param m //Nos permite cambiar la matr�cula.
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
