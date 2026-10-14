package practicas1;

public class BloqueC6 {
    public static void main (String[] args){

        /*
        Escribe expresiones que guarden en una variable:
        Qué generar
        a Un entero positivo aleatorio entre 1 y 49
        b Un entero positivo par aleatorio
        c Un número real aleatorio entre 1 y 10
        d Un entero negativo entre −50 y −150
        e Un entero entre −100 y 100
        f Uno de estos números: 5, 7, 33, 125 o 77
        g Uno de los meses del año
        Los cinco primeros salen con la fórmula de arriba. Los apartados f y g no: esos números no son
        consecutivos, y los meses no son números.
        */

            int minimo = 0;
            int maximo = 0;
            int random = 0;

            minimo = 1;
            maximo = 49;
            random = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

            IO.println("El Número Aleatorio que ha salido es: " + random);

    }
}
