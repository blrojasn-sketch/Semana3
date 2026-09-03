public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String cliente, String direccionDespacho) {
        super(idPedido, cliente, direccionDespacho);
    }

    @Override
    public void asignarRepartidor() {
        repartidor = "Erik";
        System.out.println("Encomienda asignada a: " + repartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 45;
    }
}