package Clase;

public class Circulo {
	//Atributos
	
		private int id;
		private String nombre;
		private double radio;
		private String color;
		
	//Constructor por defecto
		
		public Circulo() {
			super();
		}
		
	//Constructor 
		
		public Circulo(int id, String nombre, double radio, String color) {
			super();
			this.id = id;
			this.nombre = nombre;
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

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
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
			return "Circulo [id=" + id + ", nombre=" + nombre + ", color=" + color + "]";
		}
		

}
