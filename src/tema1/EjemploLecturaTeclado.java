package tema1;

import java.util.Scanner;

public class EjemploLecturaTeclado {
    public static void main(String[] args){

        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        Scanner sc = new Scanner(System.in);

        IO.println("Dime tu Nombre: ");
        nombre = sc.nextLine();

        IO.println("Dime tus Apellidos: ");
        apellidos = sc.nextLine();

        IO.println("Dime tu Edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        IO.println("Dime tu Número de Teléfono: ");
        numTelefono = sc.nextLine();

        IO.println("Dime tu Dirección: ");
        direccion = sc.nextLine();

        IO.println("Dime tu Código Postal: ");
        codigoPostal = sc.nextLine();


        IO.println("Nombre: " + nombre);
        IO.println("Apellidos: " + apellidos);
        IO.println("Edad: " + edad);
        IO.println("Teléfono: " + numTelefono);
        IO.println("Dirección: " + direccion);
        IO.println("Código Postal: " + codigoPostal);


    }
}
