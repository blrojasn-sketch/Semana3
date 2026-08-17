public class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método genérico
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor para el pedido " + idPedido);
    }

    // Método sobrecargado
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor +
                " asignado al pedido " + idPedido);
    }
}