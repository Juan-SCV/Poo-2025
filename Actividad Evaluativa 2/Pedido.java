import java.util.Date;

class Pedido {
    
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, java.util.Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarDatosPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Numero Tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos: ");
        for (Producto producto : productos) {
            System.out.println("Producto Numero: " + producto.getNumero());
        }
    }
}