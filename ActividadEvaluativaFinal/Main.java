package ActividadEvaluativaFinal;

public class Main {
    public static void main(String[] args) {
        Personaje jugador1 = new Asesino("Asesino");
        Personaje jugador2 = new Guerrero("Guerrero");

        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea(jugador1, jugador2);
    }
}

