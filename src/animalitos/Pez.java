package animalitos;

public class Pez extends Mascota {

	public Pez(String nombre) {
		super(nombre);
		
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y buceo");
	}
}
