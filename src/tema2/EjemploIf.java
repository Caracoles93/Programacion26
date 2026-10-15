package tema2;

public class EjemploIf {
    public static void main() {

        {
            int edad = 15;

            if (edad >= 18) {
                IO.println("El Cliente no puede entrar"); // como no se cumple la condición, no se ejecuta
            }
        }

        {
            int edad = 15;

            if (edad >= 18) {
                IO.println("El Cliente no puede entrar"); //como no se cumple la condición, no se ejecuta
            }
            else {
                IO.println("El Cliente puede entrar");//Se ejecuta el else porque la condición del if es falsa
            }
        }

        {
            int edad = 15;

            if (edad >= 18) {
                IO.println("El Cliente no puede entrar"); //como no se cumple la condición, no se ejecuta
            }
            else if (edad < 10) {
                IO.println("El Cliente no puede entrar"); //como aquí tampoco se cumple, no se ejecuta
            }
            else{
                IO.println("El Cliente puede entrar"); // se ejecuta porque las demas condiciones no se cumplen
            }

        }
    }
}
