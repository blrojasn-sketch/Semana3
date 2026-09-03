public class Main {

    public static void main(String[] args) {

        ControladorDeEnvios controlador =
                new ControladorDeEnvios();

        Pedido comida = new PedidoComida(
                101,
                "Damian Rojas",
                "Av. Punta Arenas 1117"
        );

        Pedido encomienda = new PedidoEncomienda(
                102,
                "Samantha Diaz",
                "Bahia Catalina 1565"
        );

        Pedido express = new PedidoExpress(
                103,
                "Ayline Sandoval",
                "Pasaje Cuatro 1007"
        );

        // Registrar pedidos
        controlador.registrarPedido(comida);
        controlador.registrarPedido(encomienda);
        controlador.registrarPedido(express);

        // Asignación de repartidores
        comida.asignarRepartidor();
        encomienda.asignarRepartidor("Blas");
        express.asignarRepartidor();

        // Operaciones
        controlador.despachar();
        controlador.cancelar();

        // Historial
        controlador.verHistorial();
    }
}