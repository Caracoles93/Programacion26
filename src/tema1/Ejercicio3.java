package tema1;

public class Ejercicio3 {
    public static void main(String[] args){

        /*
        Tengo dos balones en casa uno de fútbol y otro de baloncesto
        El balón de fútbol tiene radio 11 cm
        El balón de baloncesto tiene radio de 12 cm
        Calcula el volumen de cada uno y dime cuál tiene mayor volumen.
        Pista: para sacar el máximo: Math.max() */


        double radFut = 0.0;
        double radBal = 0.0;
        double volFut = 0.0;
        double volBal = 0.0;
        double volMax = 0.0;

        radFut = 11.0;
        radBal = 12.0;

        //La fórmula para calcular el volumen V=4/3 * PI * r^3
        volFut = ((4.0/3.0) * Math.PI * Math.pow(radFut,3));
        IO.println("El Volumen del Balón de Fútbol es: " + volFut);

        volBal = ((4.0/3.0) * Math.PI * Math.pow(radBal,3));
        IO.println("El Volumen del Balón de Baloncesto es: " + volBal);

        //Una vez calculamos el volumen de los balones usamos la biblioteca Math.max() para elegir el mayor

        volMax = Math.max(volFut, volBal);
        IO.println("El Balón con Mayor Volumen es: " + volMax);
    }
}
