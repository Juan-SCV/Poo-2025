package ActividadEvaluativaFinal;

public class Main {
    public static void main(String[] args) {
        Personaje jugador1 = new Paladin("Gerardo");
        Personaje jugador2 = new Mago("Antonio");

        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea(jugador1, jugador2);
    }
}

