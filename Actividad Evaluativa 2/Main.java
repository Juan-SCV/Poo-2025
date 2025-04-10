import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("12345678", "Juan Pérez");

        Producto p1 = new Producto(1);
        Producto p2 = new Producto(2);
        Producto[] productos = { p1, p2 };

        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        pedido.mostrarDatosPedido();

        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = { foto1, foto2 };

        Impresion impresion = new Impresion("Color", fotos);
        impresion.mostrarFotos();
    }
}