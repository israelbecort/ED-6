package practica6;

/**
 * Clase coche.
 * Contiene la informaci�n de los coches, contiene la matr�cula, el motor, el modelo y el fabricante.
 * Adem�s tiene los siguientes m�todos:
 * caracteristicasCoche(), cocheGasolina(), cocheDiesel(), cocheHibrido().
 * @author Israel Becerra
 * @version 1.1
 */
public class Coche {
	/**
	 * Matr�cula del coche.
	 */
	String matricula;
	/**
	 * Tipo de motor.
	 */
	String motor;
	/**
	 * Modelo del coche.
	 */
	String modelo;
	/**
	 * Fabricante (marca) del coche.
	 */
	String fabricante;

	/**
	 * Constructor vac�o.
	 */
	public Coche() {
		matricula = "";
		motor = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con par�metros.
	 * @param m 	//Matr�cula del coche.
	 * @param c 	//Motor del coche
	 * @param mo 	//Modelo del coche.
	 * @param f 	//Fabricante del coche.
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		motor = c;
		modelo = mo;
		fabricante = f;
	}

	/**
	 * Muestra las caracter�sticas del coche.
	 * @return //Devuelve el resultado.
	 */
	public String caracteristicasCoche() {
		String resultado = "";
		if (motor == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheGasolina("Corsa", "Opel");
		} else if (motor == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheDiesel("Ibiza", "Seat");
		} else if (motor == "H�brido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheHibrido("Getz", "Hyundai");
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de informaci�n";
		}
		return resultado;
	}

	/**
	 * Muestra lo el fabricante del coche y el modelo. Tabien muestra lo que cuesta el litro
	 * de este combustible.
	 * @param modelo 		//Modelo del coche.
	 * @param fabricante 	//Fabricante del coche
	 * @return				//Devuelve el resultado
	 */
	private String cocheHibrido(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y no necesita combustible.";
		return resultado;
	}

	/**
	 * Muestra lo el fabricante del coche y el modelo. Tabien muestra lo que cuesta el litro
	 * de este combustible.
	 * @param modelo 		//Modelo del coche.
	 * @param fabricante 	//Fabricante del coche
	 * @return				//Devuelve el resultado
	 */
	private String cocheDiesel(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y gasta 1,052 euros por litro.";
		return resultado;
	}

	/**
	 * Muestra lo el fabricante del coche y el modelo. Tabien muestra lo que cuesta el litro
	 * de este combustible.
	 * @param modelo 		//Modelo del coche.
	 * @param fabricante 	//Fabricante del coche
	 * @return				//Devuelve el resultado
	 */
	private String cocheGasolina(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y gasta 1,337 euros por litro.";
		return resultado;
	}
}
