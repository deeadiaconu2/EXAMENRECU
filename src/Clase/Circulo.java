package Clase;

public class Circulo {
	
	//Atributos
	
		private int id;
		private double radio;
		private String color;
		
	//Constructor por defecto
		
		public Circulo() {
			super();
		}
		
	//Constructor 
		
		public Circulo(int id, double radio, String color) {
			super();
			this.id = id;
			this.radio = radio;
			this.color = color;
		}
		
	//Getters y setters
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
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
			return "Circulo [id=" + id + ",  color=" + color + "]";
		}
		

		public static double CalcularAreaCirculo(Circulo circulo1) {
			//Calcular area Circulo: pi * r * r
			double radio = circulo1.getRadio();
			double pi = 3.14;
			double areacirculo = radio * radio * pi;
			return areacirculo;
			}
}
