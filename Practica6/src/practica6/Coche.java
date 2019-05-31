package practica6;

/**
 * Clase coche.
 * Contiene la información de los coches, contiene la matrícula, el motor, el modelo y el fabricante.
 * Además tiene los siguientes métodos:
 * caracteristicasCoche(), cocheGasolina(), cocheDiesel(), cocheHibrido().
 * @author Israel Becerra
 * @version 1.1
 */
public class Coche {
	/**
	 * Matrícula del coche.
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
	 * Constructor vacío.
	 */
	public Coche() {
		matricula = "";
		motor = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con parámetros.
	 * @param m 	//Matrícula del coche.
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
	 * Muestra las características del coche.
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
		} else if (motor == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheHibrido("Getz", "Hyundai");
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
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
