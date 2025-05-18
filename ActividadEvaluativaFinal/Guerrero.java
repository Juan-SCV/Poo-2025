package ActividadEvaluativaFinal;

public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 120);
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = 12 + random.nextInt(19); // 12-30
        System.out.println(nombre + " (Guerrero) golpea con su espada y causa " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }
}
