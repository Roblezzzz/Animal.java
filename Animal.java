public abstract class Animal
{
	protected String especie;
	protected String nombre;
	protected double peso;
	protected int jaula;

	// Constructor por defecto (sobrecarga 1)
	public Animal()
	{
		this.especie="Sin especie";
		this.nombre="Sin nombre";
		this.peso=0.0;
		this.jaula=0;
	}

	// Constructor parametrizado (sobrecarga 2)
	public Animal(String especie, String nombre, double peso, int jaula)
	{
		this.especie=especie;
		this.nombre=nombre;
		this.peso=peso;
		this.jaula=jaula;
	}

	// Metodo abstracto: cada clase derivada esta obligada a definirlo
	public abstract void queClaseDeAnimalEres();
}
