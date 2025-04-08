package Clase;

public class Rectangulo {
	
	//Atributos
	
	private int id;
	private String nombre;
	private double ladoA;
	private double ladoB;
	private String color;
	
	//Constructor por defecto
	
	public Rectangulo() {
		super();
	}
	
	//Constructor

	public Rectangulo(int id, String nombre, double ladoA, double ladoB, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}
	
	//Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Mostrar informacion
	
	@Override
	public String toString() {
		return "Rectangulo [id=" + id + ", nombre=" + nombre + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color="
				+ color + "]";
	}
	
}
