package tema1;

import java.util.Scanner;

public class EjemploLecturaTecladoJavaSuperior25 {
    public static void main(String[] args) {

        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        Scanner sc = new Scanner(System.in);

        nombre = IO.readln("Dime tu nombre: ");
        apellidos = IO.readln("Dime tus Apellidos: ");

        //Importante readln solo lee cadenas (String) por eso para la edad usamos un Integer.parseInt
        edad = Integer.parseInt(IO.readln("Dime tu Edad: "));

        numTelefono = IO.readln("Dime tu Número de Teléfono: ");
        direccion = IO.readln("Dime tu Dirección: ");
        codigoPostal = IO.readln("Dime tu Código Postal: ");


        IO.println("Nombre: " + nombre);
        IO.println("Apellidos: " + apellidos);
        IO.println("Edad: " + edad);
        IO.println("Teléfono: " + numTelefono);
        IO.println("Dirección: " + direccion);
        IO.println("Código Postal: " + codigoPostal);
    }
}
