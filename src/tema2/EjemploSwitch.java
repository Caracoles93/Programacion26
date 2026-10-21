package tema2;

public class EjemploSwitch {
    public static void main(String[] args) {

        /*
            Vamos a hacer una especie de menú
            Tenéis que pedir por teclado una opción del 1 al 5
            - 1. Mostrar todos los usuarios
            - 2. Mostrar un usuario
            - 3. Modificar un usuario
            - 4. Eliminar un usuario
            - 5. Salir

            Implementa eso con el nuevo switch, y para cada opción haz dos líneas:
            - IO.println("Has seleccionado la opción " + opcion);
            - IO.println("MOSTRAR USUARIO")

            Si no es una de esas opciones mostrar: OPCIÓN INCORRECTA
        */


        /*
        SI QUEREMON QUE SE VEA COMO UNA LISTA HAY QUE AÑADIR AL FINAL DE CADA OPCIÓN UN \n
        O CREAR TANTOS IO.println(); COMO OPCIONES TENGAS
        */
        int opcion = 0;
        IO.println("Las opciones son las siguientes: \n" +
                "1. Mostrar todos los Usuarios.\n" +
                "2. Mostrar un Usuario.\n" +
                "3. Modificar un Usuario.\n" +
                "4. Eliminar un Usuario.\n" +
                "5. Salir.\n");

        opcion = (int) Integer.parseInt(IO.readln("Selecciona una opción del 1-5: "));

        switch (opcion){ /*SI QUEREMOS PONER VARIAS OPCIONES EN UN CASE TENEMOS QUE ABRIR LLAVES EJ:
            case 1 {
                IO.println("Has seleccionado la opción 1.")
                IO.println("Ángel David"
                "Juan Antonio"
                "Ángel Cano")
            }
            */
            case 1 ->
                IO.println("Ángel David.\n" +
                        "Juan Antonio.\n" +
                        "Ángel Cano\n" +
                        "Adrián\n");
            case 2 ->
                IO.println("Ángel David");
            case 3 ->
                IO.println("Modificar Usuario");
            case 4 ->
                IO.println("Usuario Eliminado");
            case 5 ->
                IO.println("Salir");
            default -> IO.println("Has seleccionado una opción incorrecta.");
        }
    }
}
