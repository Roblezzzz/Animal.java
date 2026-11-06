public class Ave extends Animal
{
	protected String colorPlumaje;
	protected double alturaMaximaVuelo;

	public Ave()
	{
		super();
		this.colorPlumaje="Sin color";
		this.alturaMaximaVuelo=0.0;
	}

	public Ave(String especie, String nombre, double peso, int jaula, String colorPlumaje, double alturaMaximaVuelo)
	{
		super(especie, nombre, peso, jaula);
		this.colorPlumaje=colorPlumaje;
		this.alturaMaximaVuelo=alturaMaximaVuelo;
	}

	@Override
	public void queClaseDeAnimalEres()
	{
		System.out.println("Soy un ave llamada: "+nombre);
		System.out.println("de la especie: "+especie);
		System.out.println("Peso en Kg: "+peso);
		System.out.println("Estoy en la jaula: "+jaula);
		System.out.println("Mi color de plumaje es: "+colorPlumaje);
		System.out.println("Mi altura máxima de vuelo (m) es: "+alturaMaximaVuelo);
	}
}
