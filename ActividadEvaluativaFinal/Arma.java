package ActividadEvaluativaFinal;

public class Arma {
    private String nombre;
    private int dañoMin;
    private int dañoMax;

    public Arma(String nombre, int dañoMin, int dañoMax) {
        this.nombre = nombre;
        this.dañoMin = dañoMin;
        this.dañoMax = dañoMax;
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularDaño() {
        return dañoMin + (int)(Math.random() * (dañoMax - dañoMin + 1));
    }
}
