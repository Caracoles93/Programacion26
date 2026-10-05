package tema1;

public class EjemploOperadoresLogicos {
    public static void main(String[] args){

        /* En un parque de atracciones para subir a la montaña rusa "El Dragón" hace falta cumplir estas reglas:
        - Tener 12 años o más
        - Medir 140cm o más

        Pero para la montaña rusa "Mini mini" solo hace falta cumplir UNA de estas:
        - Tener menos de 12 años
        - O medir menos de 140cm

          Declara estas variables:
            int edad = 18;
            double altura = 145;

            Debes decirme:
            1. Si puede subir al dragón
            2. Si puede subir al mini mini
            3. Piensa antes de programar el resultado
            4. Cambia  edad y altura para que entre a mini mini
         */

        int edad = 0;
        double altura = 0.0;
        boolean subir = false;

        edad = 18;
        altura = 145.0;


        //Comprobación de si puede o no subir al Dragón
        subir = ((edad>=12)&&(altura>=140.0));
        IO.println("El niño puede subir al Dragón: " + subir);

        //Comprobación de si puede subir o no al Minimini
        subir = ((edad<12)||(altura<140.0));
        IO.println("El niño puede subir al Minimini: " + subir);

        //Cambio de datos para que el niño pueda subir al Minimini
        edad = 10;
        altura = 138.0;

        subir = ((edad<12)||(altura<140.0));
        IO.println("El niño puede subir al Minimini: " + subir);

    }
}
