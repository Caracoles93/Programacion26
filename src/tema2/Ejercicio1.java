package tema2;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
            Tenemos un personaje de videojuego con dos propiedades
            - armadura -> int
            - vida -> int

            Si el personaje tiene armadura aunque no tenga vida, sobrevive
            Si el personaje no tiene armadura pero la vida es igual o menor a cero muere

            Pide por teclado la vida del personaje y si tiene armadura o no
            Y escribe si un programa que diga si está vivo o Game Over
        */

        int vida, armadura;
        vida = 0;
        armadura = 0;

        vida = Integer.parseInt(IO.readln("Dime cuanta Armadura tiene el Personaje: "));

        armadura = Integer.parseInt(IO.readln("Dime cuanta Vida tiene el Personaje: "));

        if (armadura > 0 || vida > 0) {
            IO.println("El Personaje está vivo");
            }
        else{
            IO.println("GAME OVER");
        }
    }
}

