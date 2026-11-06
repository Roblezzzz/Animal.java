public class Mamifero extends Animal
{
	public Mamifero()
	{
		super();
	}

	public Mamifero(String especie, String nombre, double peso, int jaula)
	{
		super(especie, nombre, peso, jaula);
	}

	@Override
	public void queClaseDeAnimalEres()
	{
		System.out.println("Soy un mamífero llamado: "+nombre);
		System.out.println("de la especie: "+especie);
		System.out.println("Peso en Kg: "+peso);
		System.out.println("Estoy en la jaula: "+jaula);
	}
}
