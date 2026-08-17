public class Main {

    public static void main(String[] args) {

        PedidoComida pedidoComida =
                new PedidoComida(101, "Av. Central 123");

        PedidoEncomienda pedidoEncomienda =
                new PedidoEncomienda(102, "Calle Norte 456");

        PedidoExpress pedidoExpress =
                new PedidoExpress(103, "Pasaje Sur 789");

        System.out.println("===== PRUEBA DE MÉTODOS SOBRESCRITOS =====");
        pedidoComida.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor();
        pedidoExpress.asignarRepartidor();

        System.out.println("\n===== PRUEBA DE MÉTODOS SOBRECARGADOS =====");
        pedidoComida.asignarRepartidor("Jorge Jerez");
        pedidoEncomienda.asignarRepartidor("Sofia Flores");
        pedidoExpress.asignarRepartidor("Erik Rojas");
    }
}