public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String cliente, String direccionDespacho) {
        super(idPedido, cliente, direccionDespacho);
    }

    @Override
    public void asignarRepartidor() {
        repartidor = "Catalina";
        System.out.println("Pedido de comida asignado a: " + repartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 20;
    }
}