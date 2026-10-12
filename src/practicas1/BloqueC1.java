package practicas1;

public class BloqueC1 {
    public static void main (String[] args){

        /*INTERCAMBIA LOS VALORES DE LAS DOS VARIABLES
        int numA = 7, numB = 12;*/

        //CAMBIO USANDO TERCERA VARIABLE

        int numA = 0;
        int numB = 0;
        int numTemp = 0; //número temporal que usaremos para la conversión de valores

        numA = 7;
        numB = 12;
        numTemp = numA;

        numA = numB;
        numB = numTemp;

        IO.println("numA: " + numA);
        IO.println("numB: " + numB);


        //CAMBIO SIN USAR TERCERA VARIABLE, CON OPERACIONES MATEMÁTICAS

        numA = 7;
        numB = 12;

        numA = numA + numB; //numA = 7+12 -> 19
        numB = numA - numB; //numB = 19-12 -> 7
        numA = numA - numB; //numA = 19-7 -> 12

        IO.println("numA: " + numA);
        IO.println("numB: " + numB);

        //CAMBIO SIN USAR TERCERA VARIABLE, CON OPERADOR XOR

        numA = 7;
        numB = 12;

        numA = numA ^ numB; //numA = 7^12
        numB = numA ^ numB; //numB = 7^12 ^ 12 (se despejan los números repetidos y queda que numB = 7)
        numA = numA ^ numB; //numA = 7^12 ^ 7 (se despejan los números repetidos y queda que numA = 12)

        IO.println("Operador XOR - numA: " + numA);
        IO.println("Operador XOR - numB: " + numB);
    }
}
