public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String cliente, String direccionDespacho) {
        super(idPedido, cliente, direccionDespacho);
    }

    @Override
    public void asignarRepartidor() {
        repartidor = "Maximiliano";
        System.out.println("Pedido express asignado a: " + repartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 10;
    }
}