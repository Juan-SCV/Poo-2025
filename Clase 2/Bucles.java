public class Bucles {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 5; i += n) {
            System.out.println(" Iteracion : " + i);
        }

        while (n <= 5) {
            System.out.println("Iteracion While :" + n);
            n++;    
        }
    }
}
