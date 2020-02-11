package main;

public class Main {

	public static void main(String[] args) {
		
		// CREAR EVENTO
		
		// INICIALIZAR, llamar por el nombre, "new Evento", llama al metodo.
		Evento tocata1 = new Evento("07/02/2020", 5000, false, 21, 4500);
		System.out.println(tocata1);
		
		
		Evento fiesta = new Evento("20/02/2020", 5000, false, 21, 4500);
		System.out.println(fiesta);
		
		
		tocata1.cambiarEstadoEvento(true);
		System.out.println(tocata1);
	}

}
