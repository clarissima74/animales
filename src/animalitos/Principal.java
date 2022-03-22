package animalitos;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro miPerro=new Perro("Lemmy","Braco");
		Gato miGato=new Gato("Lily","Siamés");
		Tortuga miTortuga=new Tortuga("Steven","Plana");
		Pajaro miPajaro=new Pajaro("Piolin","Canario");
		
		miPerro.MandarMensaje();
		miGato.MandarMensaje();
		miTortuga.MandarMensaje();
		miPajaro.MandarMensaje();
	}

}
