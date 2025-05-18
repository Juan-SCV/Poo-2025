package ActividadEvaluativaFinal;

public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, 80, new Arma("Bastón mágico", 10, 25));
    }

    @Override
    public void atacar(Personaje oponente) {
        super.atacar(oponente);
        if (Math.random() < 0.3) { // 30% probabilidad de segundo golpe
            int dañoExtra = arma.calcularDaño();
            System.out.println(nombre + " lanza un segundo hechizo con " + arma.getNombre() + " causando " + dañoExtra + " de daño extra.");
            oponente.recibirDaño(dañoExtra);
        }
    }
}


