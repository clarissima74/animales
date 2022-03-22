package animalitos;

public class Pajaro extends Mascota {
	private String raza;

	public Pajaro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y pío");
	}
}
