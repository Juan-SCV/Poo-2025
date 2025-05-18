package ActividadEvaluativaFinal;

public class Asesino extends Personaje {
    public Asesino(String nombre) {
        super(nombre, 90);
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = 15 + random.nextInt(26); // 15-40, alto daño
        System.out.println(nombre + " (Asesino) ataca con golpe crítico y causa " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }
}
