public class Insecto extends Animal
{
	protected boolean vuela;

	public Insecto()
	{
		super();
		this.vuela=false;
	}

	// Los insectos no son animales de carne y hueso: no tienen jaula, se envia 0
	public Insecto(String especie, String nombre, double peso, boolean vuela)
	{
		super(especie, nombre, peso, 0);
		this.vuela=vuela;
	}

	@Override
	public void queClaseDeAnimalEres()
	{
		System.out.println("Soy un insecto llamado: "+nombre);
		System.out.println("de la especie: "+especie);
		System.out.println("Peso en Kg: "+peso);
		System.out.println("Estoy en la jaula: ninguna (no soy de carne y hueso)");
		if (vuela)
		{
			System.out.println("¿Vuelo?: Sí");
		}
		else
		{
			System.out.println("¿Vuelo?: No");
		}
	}
}
