public class Main {

    public static void main(String[] args) {

        Pedido comida =
                new PedidoComida(101, "Av. Trinidad 10165", 4);

        Pedido encomienda =
                new PedidoEncomienda(102, "Calle Uno 2835", 8);

        Pedido express =
                new PedidoExpress(103, "Pasaje Sur 1709", 6);

        System.out.println("===== PEDIDO COMIDA =====");
        comida.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + comida.calcularTiempoEntrega()
                + " minutos");

        System.out.println("\n===== PEDIDO ENCOMIENDA =====");
        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + encomienda.calcularTiempoEntrega()
                + " minutos");

        System.out.println("\n===== PEDIDO EXPRESS =====");
        express.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + express.calcularTiempoEntrega()
                + " minutos");
    }
}