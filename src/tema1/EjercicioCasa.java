package tema1;

public class EjercicioCasa {
    public static final double IVA = 0.21;
    public static void main(String[] args){

        /*Hay que pedir por teclado el precio de un producto
        Debéis aplicarle el 21% de IVA y mostrar el nuevo precio
        Debéis aplicarle un descuento del 5% (sobre el precio con IVA) y mostrar el
        precio final.
         */

        double descuento = 0.05;
        double precio;
        double precioFinal;
        double precioDescuento;

        precio = Double.parseDouble(IO.readln("Dime el Precio del Producto: "));

        precioFinal = precio * (IVA + 1);
        IO.println("El Precio con IVA es: " + precioFinal);


        precioDescuento = precioFinal - (precioFinal * descuento);
        IO.println("El Precio con el Descuento es: " + precioDescuento + " Euros");


    }
}
