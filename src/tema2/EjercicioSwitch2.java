package tema2;

public class EjercicioSwitch2 {
    public static void main(String[] args) {

        /*
            Crea un enum con los días de la semana llamado DiasSemana
            Pide por teclado un día de la semana escrito "Lunes, ...."
            Conviertélo al enum y muestra el mensaje:
            - LUNES, MARTES, MIERCOLES, JUEVES: hoy tengo Programación con Javi
            - VIERNES: hoy no tengo Programación con Javi, vaya!!!
            - SABADO, DOMINGO: biennn, no hay clase!!!

        */
    enum DiasSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO,
    }

    DiasSemana  diasSemana;

    diasSemana = DiasSemana.valueOf(IO.readln("Dime el Día de la Semana que es: ").toUpperCase());

    switch (diasSemana){
        case LUNES, MARTES, MIERCOLES, JUEVES -> IO.println("Hoy tengo Programación con Javi.");
        case VIERNES -> IO.println("Hoy No tengo Progrmación con Javi, Vaya!!!");
        case SABADO, DOMINGO -> IO.println("Bien, No hay Clase!!!");

        }

    }
}
