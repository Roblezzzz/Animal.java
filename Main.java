public class Main
{
	public static void main(String[] args)
	{
		Mamifero simba=new Mamifero("León", "Simba", 190.5, 1);
		Mamifero rintintin=new Mamifero("Pastor alemán", "RinTinTin", 35.0, 2);
		Ave sol=new Ave("Águila", "Sol", 4.2, 3, "Marrón", 3000.0);
		Insecto maya=new Insecto("Abeja", "Maya", 0.001, true);

		// Polimorfismo: un arreglo de Animal guarda objetos de las tres clases derivadas
		Animal[] zoologico={simba, rintintin, sol, maya};

		for (int i=0; i<zoologico.length; i++)
		{
			zoologico[i].queClaseDeAnimalEres(); // Cada objeto ejecuta SU version del metodo
			System.out.println();
		}

		// Prueba de la sobrecarga: constructor por defecto
		Mamifero sinDatos=new Mamifero();
		sinDatos.queClaseDeAnimalEres();
	}
}
