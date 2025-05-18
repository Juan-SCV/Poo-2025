package ActividadEvaluativaFinal;

import java.util.Random;

public class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected Random random;

    public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.random = new Random();
    }

    public void atacar(Personaje oponente) {
        int daño = 10 + random.nextInt(21); // 10-30
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " y causa " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
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
