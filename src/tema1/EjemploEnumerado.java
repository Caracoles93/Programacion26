package tema1;

public class EjemploEnumerado {

    public static void main (String[] args) {

    /* UN TIPO ENUMERADO ES UN CONJUNTO DE CONSTANTES FIJO*/
    enum Asignaturas{
        PROGRAMACION, SISTEMASINFORMATICOS, BASESDEDATOS, LENGUAJEDEMARCAS, ENTORNODEDESARROLLO
    }

    // Tipo    Nombre Variable =  Valor
    Asignaturas miPreferida = Asignaturas.PROGRAMACION;

    IO.println("Mi Asignatura preferida es: " + miPreferida);

    }
}
