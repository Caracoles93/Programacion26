package tema1;

public class Ejercicio1 {
    public static final double IVA = 0.21;

    public static void main (String[] args) {

        /*
        * Nos dan el Precio sin IVA de un coche -> 40.000 $
        * Tenemos primero que mostrar el precio con IVA
        * Nos dicen que hay un descuento sobre el precio con IVA de 3500$ del Plan Auto
        * Nos dicen que hay un descuento extra del concesionario sobre el precio con IVA de 1500$
        * ¿Cual es el precio final del Vehículo? */

        double preciosinIVA = 40000;
        double precioconIVA = 0.0;
        double descuentoAuto = 3500;
        double descuentoExtra = 1500;
        double resultado = 0.0;

        precioconIVA = preciosinIVA + (preciosinIVA * IVA);
        resultado = precioconIVA - descuentoAuto - descuentoExtra;

        IO.println("El Precio Final del Vehículo es: " + resultado);

    }
}
