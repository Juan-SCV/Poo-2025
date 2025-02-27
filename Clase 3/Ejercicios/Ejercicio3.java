public class Ejercicio3 {
    public static void main(String[] args) {

        int[] preciosUnitarios = {1500, 22000, 3500, 18000, 12000, 6000, 200};
        int[] cantidadesCompradas = {10, 5, 7, 3, 4, 8, 12};
        String[] descripciones = {"Producto A", "Producto B", "Producto C", "Producto D", "Producto E", "Producto F", "Producto G"};

        int n = preciosUnitarios.length;

        double[] totalesGastados = new double[n];

        double totalGeneral = 0;

        double mayorGasto = 0;
        String descripcionMayorGasto = "";

        for (int i = 0; i < n; i++) {
            totalesGastados[i] = preciosUnitarios[i] * cantidadesCompradas[i];
            totalGeneral += totalesGastados[i];

            if (totalesGastados[i] > mayorGasto) {
                mayorGasto = totalesGastados[i];
                descripcionMayorGasto = descripciones[i];
            }
        }

        System.out.println("Totales gastados por producto:");
        for (int i = 0; i < n; i++) {
            System.out.println(descripciones[i] + ": " + totalesGastados[i]);
        }

        System.out.println("\nTotal general de todas las compras: " + totalGeneral);

        System.out.println("\nProducto con mayor gasto:");
        System.out.println(descripcionMayorGasto + " con un total de: " + mayorGasto);
    }
}

