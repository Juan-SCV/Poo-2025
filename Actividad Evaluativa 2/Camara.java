class Camara extends Producto {
    
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Cámara: " + marca + " " + modelo + ", número: " + getNumero());
    }

    public void mostrarDetalles() {
        System.out.println("Camara: " + marca + ", Modelo: " + modelo);
    }
}
