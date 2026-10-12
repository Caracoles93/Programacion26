package practicas1;

public class BloqueC3 {
    public static void main (String[] args){

        /*Genera un número aleatorio que simule la tirada de un dado de seis caras. Ejecútalo diez veces
        seguidas y comprueba que salen valores entre 1 y 6, y que el 1 y el 6 salen alguna vez.*/

        int num = 0;
        int minimo = 0;
        int maximo = 0;

        minimo = 1;
        maximo = 6;
        /*En el libro viene como en el ejemplo de debajo, pero internet me lo representa así:
        num = (int) (Math.random() * maximo) + minimo; */
        num = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

        IO.println(num);


    }
}
