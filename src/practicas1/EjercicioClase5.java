package practicas1;

public class EjercicioClase5 {
    public static void main(String[] args) {

        /*
            Los cohetes Starship de SpaceX queman combustible según la fórmula de Tsiolkovsky (ecuación de un cohete):
            Av = ve * ln (m0 / mf), donde ln es el logaritmo

            Av, es el cambio de velocidad alcanzado en m/s
            ve, es la velocidad de escape de los gases en m/s
            m0, es la masa inicial del cohete con combustible en kg
            mf, es la masa final sin combustible en kg

            Escribe un programa que:
            - Declare e inicialice las variables: ve = 3300.0 m/s, m0 = 5000000.0 kg, y mf = 1500000.0 kg
            - Calcule el Av alcanzado y lo muestre por pantalla
            - Determine con un operador lógico si el cohete puede llegar a la órbita baja. Para que eso se cumpla Av debe ser
            mayor o igual que 9000 m/s, y la masa final no debe superar el 40% de la masa inicial. Muestra true o false según resultados.

            Notas:
            - Usa Math.log para el logaritmo (ln)
            - Usa operadores lógicos, no uses "if"
            - Si quieres probarte muestra los resultados con dos decimales únicamente

            Variables:
            - double av, ve, mo, mf
            - boolean llegaOrbita

        */


        double av, ve, m0, mf;
        boolean llegaOrbita;

        llegaOrbita = false;
        ve = 3300.0;
        m0 = 5000000.0;
        mf = 1500000.0;
        av = ve * Math.log (m0 / mf);

        IO.println("La Velocidad alcanzada es: " + av + " m/s");

        llegaOrbita = (av >= 9000.0) && (mf < (m0 * 0.40));
        IO.println("El Cohete llega a la Orbita: " + llegaOrbita);



}
}
