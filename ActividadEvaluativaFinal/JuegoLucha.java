package ActividadEvaluativaFinal;

public class JuegoLucha {

    public void iniciarPelea(Personaje p1, Personaje p2) {
        System.out.println("¡Comienza la pelea entre " + p1.getNombre() + " y " + p2.getNombre() + "!\n");

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            mostrarEstado(p1, p2);
            if (!p2.estaVivo()) break;

            p2.atacar(p1);
            mostrarEstado(p1, p2);
        }

        if (p1.estaVivo()) {
            System.out.println("\n" + p1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("\n" + p2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void mostrarEstado(Personaje p1, Personaje p2) {
        System.out.println("Estado actual:");
        System.out.println(p1.getNombre() + ": " + p1.getPuntosDeVida() + " HP");
        System.out.println(p2.getNombre() + ": " + p2.getPuntosDeVida() + " HP\n");
    }
}
