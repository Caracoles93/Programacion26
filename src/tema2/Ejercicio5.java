package tema2;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*
            La clase de Programación se va el lunes de viaje a la Estación Experimental
            Queremos saber cuánto cuesta el viaje
            - Si van más de 30 alumnos el viaje cuesta 5€ por alumno
            - Si van entre 15 y 30 alumnos el viaje cuesta 8€ por alumno
            - Si van menos de 15 alumnos el viaje cuesta 1000€

            Pide por teclado cuántos alumnos van y calcula cuánto cuesta el bus
        */



        /*
        int alumnos, coste;
        alumnos = 0;
        coste = 0;

        alumnos = Integer.parseInt(IO.readln("Cuantos Alumnos van: "));

        if (alumnos > 30) {
           coste = alumnos * 5;
        }
        else if (alumnos >=15 ) {
           coste = alumno * 8;
        }
        else {
           coste = 1000;
        }
           IO.println("El costo del viaje es: " + coste);
        */

        int alumnos, coste;
        alumnos = 0;
        coste = 0;

        alumnos = Integer.parseInt(IO.readln("Cuantos Alumnos van: "));

        if (alumnos > 30) {
            IO.println("El Viaje Cuesta: " + (alumnos*5) + " € en Total");
        }
        else if (alumnos >=15 && alumnos <=30) {
            IO.println("El Viaje Cuesta: " + (alumnos*8) + " € en Total" );
        }
        else if (alumnos < 15) {
            IO.println("El Viaje Cuesta: 1000 € en Total");
        }
    }
}
