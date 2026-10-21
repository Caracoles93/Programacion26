package tema2;

public class EjercicioSwitch1 {
    public static void main(String[] args) {
        /*
            Somos una empresa de transporte y vamos a ver el estado de los paquetes.
            Pedimos por teclado el estado del paquete como String:
            - PENDIENTE
            - PROCESANDO
            - ENVIADO
            - ENTREGADO
            - CANCELADO

            Según la opción mostraremos el estado del pedido:
            - Tu pedido ha sido recibido y está pendiente de pago
            - Tu pedido se está preparando en el almacén
            - El pedido va en camino con el servicio de mensajería
            - El pedido ha sido entregado con éxito
            - El pedido ha sido cancelado
            - Estado del pedido desconocido (si no es uno de los anteriores)
        */

        String estado;
        IO.println("DIME EL ESTADO DEL PEDIDO: ");
        IO.println("PENDIENTE");
        IO.println("PROCESANDO");
        IO.println("ENVIADO");
        IO.println("ENTREGADO");
        IO.println("CANCELADO");

        estado = IO.readln("ESTADO DEL PEDIDO: ");

        switch (estado.toUpperCase()) /*PARA QUE NO HAYA PROBLEMA CON minúsculas y MAYÚSCULAS PONEMOS .toUpperCase()
                PARA QUE AUTOMÁTICAMENTE EL PROGRAMA LOS CONVIERTA A MAYÚSCULAS
                */
        {
        case "PENDIENTE" -> IO.println("Pedido recibido y pendiente de pago" );
        case "PROCESANDO"-> IO.println("Pedido preparado en almacén" );
        case "ENVIADO"   -> IO.println("Pedido en camino" );
        case "ENTREGADO" -> IO.println("Pedido entregado" );
        case "CANCELADO" -> IO.println("Pedido Cancelado" );
            default -> IO.println("ESTADO DEL PEDIDO DESCONOCIDO");
        }

    }
}
