public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de comida #" + idPedido +
                ": Se asigna repartidor con mochila térmica.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor +
                " asignado al pedido de comida #" + idPedido +
                ". Validación: mochila térmica disponible.");
    }
}