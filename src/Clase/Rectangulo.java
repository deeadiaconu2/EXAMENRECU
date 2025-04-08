package Clase;

public class Rectangulo {
	
	//Atributos
	
	private int id;
	private double ladoA;
	private double ladoB;
	private String color;
	
	//Constructor por defecto
	
	public Rectangulo() {
		super();
	}
	
	//Constructor

	public Rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		this.id = id;
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
		return "Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color="
				+ color + "]";
	}
	
	public static double CalcularAreaRectangulo (Rectangulo rectangulo1) {
		// Calcular area rectangulo: ladoA*ladoB 
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA + ladoB;
		return areaRectangulo;
	}
}
