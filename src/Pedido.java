public abstract class Pedido {

    protected int idPedido;
    protected String cliente;
    protected String direccionDespacho;
    protected String repartidor;

    public Pedido(int idPedido, String cliente, String direccionDespacho) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.direccionDespacho = direccionDespacho;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDireccionDespacho() {
        return direccionDespacho;
    }

    public void mostrarResumen() {
        System.out.println("Pedido: " + idPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Dirección de despacho: " + direccionDespacho);
        System.out.println("Repartidor: " + repartidor);
    }

    public abstract int calcularTiempoEntrega();

    public abstract void asignarRepartidor();

    public void asignarRepartidor(String nombre) {
        repartidor = nombre;
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }
}