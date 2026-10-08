package tema1;

public class EjercicioCasa3 {
    public static void main(String[] args){

        /*La ficha de un producto tiene la siguiente información:
        - Nombre
        - Descripción
        - Precio
        - IVA (0.21, 0.10...)
        - Categoría
        - Stock en Almacén
         */

        String nombre, descripcion, categoria;
        int stock;
        double iva, precio;

        IO.println("---INFORMACIÓN DEL PRODUCTO---");
        nombre = IO.readln("Dime el Nombre del Producto: ");
        descripcion = IO.readln("Dime la Descrición del Producto: ");
        precio = Double.parseDouble(IO.readln("Dime el Precio del Producto: "));
        iva = Double.parseDouble(IO.readln("Dime el IVA del Producto: "));
        categoria = IO.readln("Dime la Categoría del Producto: " );
        stock = Integer.parseInt(IO.readln("Dime el Stock del Producto: "));

        IO.println("El Producto se Llama: " + nombre);
        IO.println("El Producto es: " + descripcion);
        IO.println("El Producto cuesta: " + precio);
        IO.println("El Producto con IVA es: " + precio*iva);
        IO.println("El Producto pertenece a la categoría de: " + categoria);
        IO.println("El Producto tiene en Stock: " + stock + " Unidades");

    }
}
