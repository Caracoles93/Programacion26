package tema1;

public class EjemploUnarios {
    public static void main (String[] args){

        int a = 5, b = 3;
        int c;

        // Como el ++ va delante de a no se tiene en cuenta en la operación de c
        c = a++ - b;
        IO.println(c);

        a = 5;
        b = 3;

        // Como el ++ va detrás de a si se tiene en cuenta en la operación de c, es decir a = 6
        c = ++a - b;
        IO.println(c);

        //En ambas modifica el valor para futuras operaciones con la letra a

    }
}
