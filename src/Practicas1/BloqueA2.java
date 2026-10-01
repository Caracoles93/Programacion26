package Practicas1;

public class BloqueA2 {
    public static void main(String[] args){

        //EJERCICIOS A REALIZAR
        // 1. Que Imprime cada línea de código:
        System.out.println(5 / 2); //2 Porque al ser números enteros redondea 2,5 a 2
        System.out.println(5 / 2.0); //2.5 Porque el divisor 2 esta en variable double y nos da el decimal 2.5
        System.out.println(5 % 2); //1 Porque es el resto de la división
        System.out.println(-5 / 2); //-2 Porque al ser números enteros redondea -2,5 a -2
        System.out.println(-5 % 2); //-1 Porque es el resto de la división
        System.out.println(5.0 / 0); //Infinito Porque un número dividido entre 0 es infinito
        System.out.println(0.0 / 0.0); //Indeterminado Porque no hay respuesta única y coherente
        System.out.println(0.1 + 0.2); //0,3000000004
        System.out.println(0.1 + 0.2 == 0.3); //False Porque la suma da 0.3000000004 y es diferente a 0,3
        System.out.println((int) 3.99); //3 Porque al declararlo como variable entera redondea el decimal
        System.out.println((int) -3.99);//-3 Porque al declararlo como variable entera redondea el decimal
        System.out.println(Math.round(3.5)); //
        System.out.println(Math.round(-3.5));
        System.out.println(Math.round(2.5));
        System.out.println(10 / 3 * 3); /*9 Porque aunque realmente es 10 al no declararlo como double redondea y queda
        en 9. Para que fuera 10 debería ser como en el ejemplo de debajo */
        System.out.println((double) 10 / 3 * 3); //10
    }
}
