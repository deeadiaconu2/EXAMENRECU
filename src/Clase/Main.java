package Clase;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(1, 3, "Naranja");
        Rectangulo rectangulo1 = new Rectangulo(1, 3, 5, "Verde");

        double areaCirculo = calcularAreaCirculo(circulo1);
        double areaRectangulo = calcularAreaRectangulo(rectangulo1);

        System.out.println(circulo1);
        System.out.println(rectangulo1);
        System.out.println("Área Círculo: " + areaCirculo);
        System.out.println("Área Rectángulo: " + areaRectangulo);
    }

	private static double calcularAreaRectangulo(Rectangulo rectangulo1) {
		return rectangulo1.getLadoA()*rectangulo1.getLadoB();
	}

	private static double calcularAreaCirculo(Circulo circulo1) {
		return circulo1.getRadio() * circulo1.getRadio() * 3.1416;
	}

}