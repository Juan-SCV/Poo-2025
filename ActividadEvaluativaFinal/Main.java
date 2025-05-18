package ActividadEvaluativaFinal;

public class Main {
    public static void main(String[] args) {
        Personaje guerrero1 = new Personaje("Guerrero A", 100);
        Personaje guerrero2 = new Personaje("Guerrero B", 100);

        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea(guerrero1, guerrero2);
    }
}
