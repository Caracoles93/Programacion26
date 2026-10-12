package practicas1;

public class BloqueC2 {
    public static void main(String[] args){

        //DE SEGUNDOS A HORAS, MINUTOS Y SEGUNDOS
        /*Una variable int t contiene un tiempo en segundos. Muéstralo en horas, minutos y segundos.
        Con t = 3725*/

        int t = 0;
        int tSeg = 0;
        int tMin = 0;
        int tHor = 0;

        t = 3725;
        tSeg = t;
        tMin = (tSeg / 60);//Segundos pasados a minutos = 62 minutos
        tHor = (tMin / 60);//Minutos pasados a horas = 1 hora

        tMin = tMin % 60; //Sacamos los minutos restantes = 2 Minutos
        tSeg = tSeg % 60;//Sacamos los segundos restantes = 5 Segundos


        IO.println("El tiempo en horas, minutos y segundos sería: " +  tHor + " Horas " + tMin + " Minutos " + tSeg + " Segundos");
    }
}
