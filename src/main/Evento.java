package main;

public class Evento {

	// NOMBRE - PRIMERO LOS ATRIBUTOS - COMPORTAMIENTO - GETANDSET-
	// VARIABLES
	private String fechaEvento;
	private int capacidadEvento;
	private boolean enCurso;
	private int edadMinimaEvento;
	private int cantidadEntDisponible;

//CONSTRUCTOR
	public Evento(String fechaEvento, int capacidadEvento, boolean enCurso, int edadMinimaEvento,
			int cantidadEntDisponible) {
		super();
		this.fechaEvento = fechaEvento;
		this.capacidadEvento = capacidadEvento;
		this.enCurso = enCurso;
		this.edadMinimaEvento = edadMinimaEvento;
		this.cantidadEntDisponible = cantidadEntDisponible;
	}

	// GET AND SET

	public String getFechaEvento() {
		return fechaEvento;

	}

	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public int getCapacidadEvento() {
		return capacidadEvento;
	}

	public void setCapacidadEvento(int capacidadEvento) {
		this.capacidadEvento = capacidadEvento;
	}

	public boolean isEnCurso() {
		return enCurso;
	}

	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}

	public int getEdadMinimaEvento() {
		return edadMinimaEvento;
	}

	public void setEdadMinimaEvento(int edadMinimaEvento) {
		this.edadMinimaEvento = edadMinimaEvento;
	}

	public int getCantidadEntDisponible() {
		return cantidadEntDisponible;
	}

	public void setCantidadEntDisponible(int cantidadEntDisponible) {
		this.cantidadEntDisponible = cantidadEntDisponible;
	}

	@Override
	public String toString() {
		return "Evento [fechaEvento=" + fechaEvento + ", capacidadEvento=" + capacidadEvento + ", enCurso=" + enCurso
				+ ", edadMinimaEvento=" + edadMinimaEvento + ", cantidadEntDisponible=" + cantidadEntDisponible + "]";

	}

	// COMPORTAMIENTO

	public void cambiarEstadoEvento(boolean parametro) {
		this.setEnCurso(parametro);
	}

}
