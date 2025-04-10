class Impresion {
    
    private String color;
    private Foto[] fotos;

    public Impresion(String color, Foto[] fotos) {
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public void mostrarFotos() {
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}