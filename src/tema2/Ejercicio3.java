package tema2;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
        Nos piden comprobar un usuario y una contraseña.
        El usuario es fijo "usuario".
        Guardamos la contraseña en una variable como "1234567890"
        Pedimos el usuario por teclado.
        Pedimos la contraseña por teclado.
        Si coinciden el usuario y la contraseña con los que tenemos guardados:
        - Credenciales correctas, Bienvenido.
        - Si no, Credenciales Incorrectas.
        */

        String user = "Usuario";
        String password = "1234567890";
        String userNew;
        String passwordNew;

        userNew = IO.readln("Dime tu Usuario: ");
        passwordNew = IO.readln("Dime tu Contraseña: ");

        /*En el Usuario se pone .toUpperCase() para que nos convierta el texto a mayúsculas y no haya problema a la hora
          de comparar el usuario real con el que se escribe.

          En la contraseña NO SE PONE el .toUpperCase() porque una contraseña puede contener mayúsculas y minúsculas.

          El .equals es parecido al == pero se usa para comparar la igualdad entre STRING
        */

        if (user.toUpperCase().equals(userNew.toUpperCase()) && password.equals(passwordNew)){
            IO.println("Credenciales Correctas, Bienvenido");
        }
        else {
            IO.println("Credenciales Incorrectas");
        }

    }
}
