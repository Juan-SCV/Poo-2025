public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int[] arregloInicial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = arregloInicial.length;

        int numeroPares = 0, numeroImpares = 0;

        for (int i = 0;  i < n; i++) {

            if (arregloInicial[i] % 2 == 0) {
                numeroPares++;
            } else {
                numeroImpares++;
            }
        }

        int[] arregloPares = new int[numeroPares];

        int[] arregloImpares = new int[numeroImpares];;

        int paresIndex = 0, imparesIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arregloInicial[i] % 2 == 0) {
                arregloPares[paresIndex++] = arregloInicial[i];
            } else {
                arregloImpares[imparesIndex++] = arregloInicial[i];
            }
        }

        // Imprimir los resultados
        System.out.print("Arreglo de números pares: ");
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.print(arregloPares[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo de números impares: ");
        for (int i = 0; i < arregloImpares.length; i++) {
            System.out.print(arregloImpares[i] + " ");
        }
        System.out.println();
    }
}
