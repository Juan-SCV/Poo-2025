package ActividadEvaluativaFinal;

public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = 12 + random.nextInt(19);
        boolean dobleAtaque = random.nextBoolean(); 

        System.out.println(nombre + " (Mago) lanza hechizo y causa " + daño + " de daño.");
        oponente.recibirDaño(daño);

        if (dobleAtaque) {
            int segundoDaño = 5 + random.nextInt(11); // 5-15
            System.out.println(nombre + " (Mago) lanza un segundo hechizo y causa " + segundoDaño + " de daño.");
            oponente.recibirDaño(segundoDaño);
        }
    }
}

