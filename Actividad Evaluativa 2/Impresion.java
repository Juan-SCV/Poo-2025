class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public void mostrarFotos() {
        System.out.println("Impresion en color: " + color);
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}