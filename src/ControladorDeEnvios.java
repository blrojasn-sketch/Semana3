import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable,
        Cancelable,
        Rastreable {

    private ArrayList<String> historial = new ArrayList<>();

    public void registrarPedido(Pedido pedido) {
        historial.add(
                "Pedido #" + pedido.getIdPedido()
                        + " | Cliente: " + pedido.getCliente()
                        + " | Dirección: " + pedido.getDireccionDespacho()
        );
    }

    @Override
    public void despachar() {
        historial.add("Pedido despachado");
        System.out.println("Pedido enviado correctamente.");
    }

    @Override
    public void cancelar() {
        historial.add("Pedido cancelado");
        System.out.println("Pedido cancelado.");
    }

    @Override
    public void verHistorial() {

        System.out.println("\n===== HISTORIAL DE PEDIDOS =====");

        if (historial.isEmpty()) {
            System.out.println("No existen registros.");
        } else {
            for (String evento : historial) {
                System.out.println(evento);
            }
        }
    }
}