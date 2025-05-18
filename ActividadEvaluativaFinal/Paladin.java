package ActividadEvaluativaFinal;

public class Paladin extends Personaje {
    public Paladin(String nombre) {
        super(nombre, 110);
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = 10 + random.nextInt(16); // 10-25
        int curacion = 5 + random.nextInt(6); // 5-10
        System.out.println(nombre + " (Paladín) ataca y causa " + daño + " de daño. Se cura " + curacion + " puntos.");
        oponente.recibirDaño(daño);
        puntosDeVida += curacion;
    }
}
