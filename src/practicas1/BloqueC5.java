package practicas1;


public class BloqueC5 {
    public static final double pi = Math.PI;
    public static void main (String[] args){

        /*
        Calcula el área de la base y el volumen de un cilindro de 15,5 cm de diámetro y 42,4 cm de
        altura.
        Declara el diámetro y la altura como variables, y usa una constante para Pi ( final
        double PI = Math.PI; ).
        Area de la base: 188,69 cm2
        Volumen: 8000,54 cm3
        */

        //Área de Cilindro = PI * r^2

        double altura = 0.0;
        double diametro = 0.0;
        double radio = 0.0;
        double area = 0.0;
        double volumen = 0.0;

        altura = 42.4;
        diametro = 15.5;
        radio = diametro / 2.0;
        area = pi * (Math.pow(radio, 2));

        IO.println("El Área del Cilindro es: " + area + " Cm");


        //Volumen de un Cilindro = PI * r^2 * h

        volumen = pi * Math.pow(radio, 2) * altura;
        IO.println("El Volumen del Cilindro es: " + volumen + " Cm");
    }
}
