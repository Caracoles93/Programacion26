package ejerciciosrepaso;

public class Repaso11 {
    public static void main() {

        int num = 0;
        int decenas = 0;
        int unidades = 0;
        int numInverido = 0;

        num = Integer.parseInt(IO.readln("Dime el Número: "));

        decenas = num / 10;
        unidades = num % 10;
        numInverido = (unidades * 10) + decenas;

        IO.println("El Número invertido es: " + numInverido);

    }
}
