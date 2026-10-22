package tema2;

public class Ejercicio4 {
    public static void main(String[] args) {

        int mes = 0, dia = 0;

        mes = Integer.parseInt(IO.readln("Dime un Mes: "));
        dia = Integer.parseInt(IO.readln("Dime un Día del Mes: "));



        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    IO.println("Fecha Correcta");
                }
                else{
                    IO.println("Fecha Incorrecta");
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    IO.println("Fecha Correcta");
                }
                else {
                    IO.println("Fecha Incorrecta");
                }
            }
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    IO.println("Fecha Correcta");
                }
                else{
                    IO.println("Fecha Incorrecta");
                }
            }
        }
    }
}

