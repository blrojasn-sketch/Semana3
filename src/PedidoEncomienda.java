public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de encomienda #" + idPedido +
                ": Validando peso y embalaje antes de asignar repartidor.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor +
                " asignado a la encomienda #" + idPedido +
                ". Peso y embalaje verificados correctamente.");
    }
}