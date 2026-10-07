package practicas1;

public class EjercicioClase1 {
    public static void main(String[] args) {

        /*
            La nota de programación de la primera evaluación se calcula:
            - 30% una prueba de clase a mitad de trimestre
            - 30% un exámen al final de la evaluación
            - 25% de prácticas de clase
            - 15% de Asistencia.

            Pide cada nota por teclado y muestra la nota final del trimestre
        */


        double notaPrueba;
        double notaExamen;
        double notaPracticas;
        double notaAsistencia;
        double notaTotal;


        notaExamen = Double.parseDouble(IO.readln("Dime tu nota de Examen: "));
        notaPracticas = Double.parseDouble(IO.readln("Dime tu nota de Prácticas: "));
        notaPrueba = Double.parseDouble(IO.readln("Dime tu nota de la Prueba: "));
        notaAsistencia = Double.parseDouble(IO.readln("Dime tu nota de Asistencia: "));

        notaTotal = (notaExamen *  0.3) + (notaPracticas * 0.25) + (notaPrueba * 0.3) + (notaAsistencia * 0.15);
        IO.println("Tu Nota Final de la Programación es: " + notaTotal);



    }
}
