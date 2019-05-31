package practica6;

public class Coche {
	String matricula;
	String motor;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		motor = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		motor = c;
		modelo = mo;
		fabricante = f;
	}

	public String caracteristicasCoche() {
		String resultado = "";
		if (motor == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheGasolina(modelo, fabricante);
		} else if (motor == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheDiesel(modelo, fabricante);
		} else if (motor == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += cocheHibrido(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

	private String cocheHibrido(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y gasta 1,337 euros por litro.";
		return resultado;
	}

	private String cocheDiesel(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y gasta 1,052 euros por litro.";
		return resultado;
	}

	private String cocheGasolina(String modelo, String fabricante)
	{
		String resultado="es un"+fabricante+modelo+"y no necesita combustible.";
		return resultado;
	}
}
