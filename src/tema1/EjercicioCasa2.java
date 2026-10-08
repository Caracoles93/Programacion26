package tema1;

public class EjercicioCasa2 {
    public static void main(String[] args){

        //Tienes dos variables númeroA y númeroB y queremos intercambiar sus valores

        int numA, numB, temp; /* Debemos guardar una variable temporal por ello creamos una variable que podemos
        llamar como quereramos pero le pondremos temp de temporal*/

        numA = 10;
        numB = 3;
        temp = numA; //Copiamos el valor del número A

        numA = numB;
        numB = temp;

        IO.println("El Número A pasa a ser: " + numA);
        IO.println("El Número B pasa a ser: " + numB);

    }
}
