package animalitos;

public class Gato extends Mascota {

	private String raza;

	public Gato(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y maúllo");
	}
}
