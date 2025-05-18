package ActividadEvaluativaFinal;

public class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected Arma arma;

    public Personaje(String nombre, int puntosDeVida, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.arma = arma;
    }

    public void atacar(Personaje oponente) {
        int daño = arma.calcularDaño();
        System.out.println(nombre + " ataca con " + arma.getNombre() + " y causa " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
