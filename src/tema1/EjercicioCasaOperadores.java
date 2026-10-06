package tema1;

public class EjercicioCasaOperadores {
    public static void main(String[] args){

        int x = 5;
        int y = 10;
        boolean resultado = (++x > 5) && (y-- < 10); // (6 > 5) && (10 < 10);

        IO.println(resultado);
        // El resultado es FALSE
        IO.println("x= " + x + " Y= " + y);


        int m = 4;
        int n = 7;

        resultado = !(m * 2 > n++) || (m + ++n == 13); // !(8 > 8) || (4 + 9 == 13); se haría primero el segundo paréntesis
        IO.println(resultado);
        // El resultado es TRUE
        IO.println("m= " + m + " n= " + n);

    }
}
