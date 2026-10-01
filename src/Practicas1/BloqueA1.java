package Practicas1;

public class BloqueA1 {
    public static void main(String[] args){

        int A = 6;
        int B = 2;
        int C = 3;

        //EJERCICIOS A REALIZAR
        // 1. (A*C)%C
        int sol1 = (A*C)%C;
        IO.println("La Solución del Ejercicio 1 es: " + sol1);

        // 2. A*B/C
        int sol2 = (A*B)/C;
        IO.println("La Solución del Ejercicio 2 es: " + sol2);

        // 3. (C%B)+(C*B)
        int sol3 = (C%B)+(C*B);
        IO.println("La Solución del Ejercicio 3 es: " + sol3);

        // 4. A%(A*B*C/(B+C))
        int sol4 = A%(A*B*C/(B+C));
        IO.println("La Solución del Ejercicio 3 es: " + sol4);

        // 5. B*B+C-B*(A%B)
        int sol5 = (B*B)+C-B*(A%B);
        IO.println("La Solución del Ejercicio 5 es: " + sol5);


    }
}
