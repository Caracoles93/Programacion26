package tema2;

public class OtroEjemploIf {
    public static void main(String[] args) {

        //Dime si has aprobado las dos asignaturas, una de ellas o ninguna

        double programacion, baseDatos;
        programacion = 4.5;
        baseDatos = 6.2;

        //Hay Dos formas de hacerlo

        if (programacion >= 5.0) {
            IO.println("Has Aprobado Programación");

            if (baseDatos >= 5.0) {
                IO.println("Has Aprobado Base de Datos");
            }
            if (programacion >= 5.0 && baseDatos < 5.0) {
                IO.println("Has Aprobado Programación, pero Base de Datos la has Suspendido");
            }
            if (programacion < 5.0 && baseDatos >= 5.0) {
                IO.println("Has Suspendido Programación, pero has Aprobado Base de Datos");
            }

        }
            else {
                IO.println("Has Suspendido las dos Asignaturas");
                }

            }
        }


