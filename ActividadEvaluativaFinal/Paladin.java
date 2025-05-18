package ActividadEvaluativaFinal;

public class Paladin extends Personaje {
    public Paladin(String nombre) {
        super(nombre, 110, new Arma("Espada de una mano y escudo", 9, 20));
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = arma.calcularDaño();
        int curacion = 3 + (int)(Math.random() * 5); // 5-10

        System.out.println(nombre + " ataca con " + arma.getNombre() + " y causa " + daño + " de daño. Se cura " + curacion + " HP.");
        oponente.recibirDaño(daño);
        puntosDeVida += curacion;
    }
}
