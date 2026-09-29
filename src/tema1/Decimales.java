package tema1;

public class Decimales {
    public static void main (String[] args){

        //La variable para números con decimales por ejemplo el precio de algo se usa "float" añadir una "f" al final del resultado del float, si no se pone la "f" java interpreta que la variable es double

        float precio = 25.95f;

        IO.println("El Precio del Producto es: " + precio);

        //La variable para números con decimales más largos por ejemplo el número PI se usa "double"
        //Mejor Iniciar la variable y despúes le damos valor como en el ejemplo

        double pi = 0.0; //Inicio de variable
        pi = Math.PI; //Damos valor con la biblioteca "Math"

        IO.println("El Número PI es: " + pi);

    }
}
