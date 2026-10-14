package practicas1;

public class BloqueC4 {
    public static void main (String[] args){

        /*Calcula cuánto dinero tendrás después de seis meses si pones 2000 € en un plazo fijo al 2,75 %
        anual. Hacienda retiene el 18 % de los intereses.
        Interes bruto: 27,50 EUR
        Retencion: 4,95 EUR
        Interes neto: 22,55 EUR
        Total final: 2022,55 EUR*/

        double dinero = 0.0;
        double interes = 0.0;
        double retencion = 0.0;
        double dineroTotal = 0.0;
        double interesTotal = 0.0;

        dinero = 2000.0;
        interes = (dinero * 0.0275) / 2; //Otra forma, interes = ((dinero * 0.0275) * 6 ) / 12;
        retencion = (interes * 0.18) ;
        dineroTotal = (dinero + interes) - retencion;
        interesTotal = interes - retencion;


        IO.println("Al cabo de 6 meses el dinero total que tendrá el cliente es de: " + dineroTotal + (" Euros"));
        IO.println("Al cabo de 6 meses el interes total que tendrá el cliente es de: " + interesTotal + (" Euros"));
    }
}
