package tema1;

public class EjemploOperadoresRelacionales {
    public static void main(String[] args){

        int precio = 125;
        String password = "12345678";
        boolean res = false;

        //Dime si el precio es > que 100
        res = (precio > 100);
        IO.println(res);

        //Dime si el precio es >= que 130
        res = (precio >= 130);
        IO.println(res);

        //Dime si el precio es < que 100
        res = (precio < 100);
        IO.println(res);

        //Dime si el precio es <= que 125
        res = (precio <= 125);
        IO.println(res);


        //Dime si la contraseña es igual a 12345678 o no
        boolean igual = (password == "12345678");
        IO.println(igual);
    }
}
