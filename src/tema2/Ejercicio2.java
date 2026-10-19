package tema2;

public class Ejercicio2 {
    public static void main(String[] args) {

        int dado, minimo, maximo;
        dado = 0;
        minimo = 1;
        maximo = 20;


        dado = (int) (Math.random() * (maximo - minimo + 1)) +minimo;
        IO.println("El Número del Dado es: " + dado);

        if (dado == 1) {
            IO.println("El Héroe Pifia, Tropieza y Pierde el Combate");
        }
        else if (dado >= 2 && dado <= 5 ){
                IO.println("El Héroe huye Despavorido");
            }
        else if (dado >= 6 && dado <= 10){
            IO.println(" El Héroe se cubre con todo el Escudo");
        }
        else if (dado >= 11 && dado <= 15){
            IO.println("El Héroe Ataca Normal con la Espada");
        }
        else if (dado >= 16 && dado <= 19) {
            IO.println("El Héroe Ataca Ferozmente");
        }
        else {
            IO.println("El Héroe hace un Golpe Crítico, El Orco está Muerto");
        }
    }

}

