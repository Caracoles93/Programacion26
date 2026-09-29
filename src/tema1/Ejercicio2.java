package tema1;

public class Ejercicio2 {
    public static void main (String[] args) {
        /*
        * Un programa me da el cateto1 y el cateto2 de un triángulo
        * Tienes que devolver la hipotenusa
        * TRUCO -> Math.sqtr para calcular la raíz cuadrada*/

        double cat1 = 0.0;
        double cat2 = 0.0;
        double hipotenusa = 0.0;
        cat1 = 15.0;
        cat2 = 12.0;
        hipotenusa = Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2));

        IO.println("La Hipotenusa es: " + hipotenusa);


    }
}
