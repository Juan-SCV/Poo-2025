package ActividadEvaluativaFinal;

public class Asesino extends Personaje {
    private int sangrado;

    public Asesino(String nombre) {
        super(nombre, 90, new Arma("Dagas", 12, 25));
        this.sangrado = 0;
    }

    @Override
    public void atacar(Personaje oponente) {
        int daño = arma.calcularDaño();
        System.out.println(nombre + " ataca con " + arma.getNombre() + " y causa " + daño + " de daño.");

        // Aplica daño por sangrado
        if (sangrado > 0) {
            System.out.println(nombre + " aplica sangrado y causa " + sangrado + " de daño extra.");
            oponente.recibirDaño(sangrado);
        }

        oponente.recibirDaño(daño);

        // Incrementa el sangrado para el siguiente turno
        sangrado += 3 + (int)(Math.random() * 4); 
    }
}

