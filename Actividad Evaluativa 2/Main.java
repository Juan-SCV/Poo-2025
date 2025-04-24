import java.util.Date;

public class Main {

    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("12345678", "Juan Pérez");

        Producto p1 = new Producto(1);
        Producto p2 = new Producto(2);
        Producto[] productos = { p1, p2 };

        Pedido pedido1 = new Pedido(cliente, productos, new Date(), 987654321);
        System.out.println("Datos del Primer Pedido:");
        pedido1.mostrarDatosPedido();

        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = { foto1, foto2 };

        Impresion impresion = new Impresion(1, "Color", fotos);
        System.out.println("\nFotos para impresión:");
        impresion.mostrarFotos();

        Producto p3 = new Producto(3);
        Producto p4 = new Producto(4);
        Producto[] productosAdicionales = { p3, p4 };

        Pedido pedido2 = new Pedido(cliente, productosAdicionales, new Date(), 123456789);
        System.out.println("\nDatos del Segundo Pedido:");
        pedido2.mostrarDatosPedido();

        Camara camara = new Camara(5, "Nikon", "Z50");

        Producto[] listaProductos = { p1, impresion, camara };

        System.out.println("\nDescripciones de productos (polimorfismo):");
        for (Producto prod : listaProductos) {
            prod.mostrarDescripcion(); // Llamada polimórfica
        }
    }
}
