package animalitos;

public class Pez extends Mascota{
	private String raza;

	public Pez(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y glu,glu");
	}
}
