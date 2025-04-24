class Producto {
    
    private int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método para polimorfismo
    public void mostrarDescripcion() {
        System.out.println("Producto genérico con número: " + numero);
    }
}
