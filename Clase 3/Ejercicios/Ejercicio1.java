public class Ejercicio1 {

    public static void main(String[] args) {
        
        String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Luis"};
        int[] edades = {45, 35, 50, 40, 30};
        char[] sexos = {'M', 'F', 'M', 'F', 'M'};

        int n = nombres.length; 

        int sumaEdades = 0;
        for (int i = 0; i < n; i++) {
            sumaEdades += edades[i];
        }
        double edadPromedio = (double) sumaEdades / n;

        String nombreMasJoven = nombres[0];
        String nombreMasViejo = nombres[0];
        int edadMasJoven = edades[0];
        int edadMasViejo = edades[0];

        for (int i = 1; i < n; i++) {
            if (edades[i] < edadMasJoven) {
                edadMasJoven = edades[i];
                nombreMasJoven = nombres[i];
            }
            if (edades[i] > edadMasViejo) {
                edadMasViejo = edades[i];
                nombreMasViejo = nombres[i];
            }
        }

        int contadorProfesoraMayor = 0;
        int contadorProfesorMenor = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 'F' && edades[i] >= edadPromedio) {
                contadorProfesoraMayor++;
            }
            if (sexos[i] == 'M' && edades[i] <= edadPromedio) {
                contadorProfesorMenor++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Edad promedio del grupo de profesores: " + edadPromedio);
        System.out.println("Nombre del profesor más joven: " + nombreMasJoven);
        System.out.println("Nombre del profesor con mayor edad: " + nombreMasViejo);
        System.out.println("Número de profesoras con edad mayor al promedio: " + contadorProfesoraMayor);
        System.out.println("Número de profesores con edad menor al promedio: " + contadorProfesorMenor);
    }
}

