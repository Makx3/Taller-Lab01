import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m, n;
        do {
            System.out.println("Ingrese el numero de filas:");
            m = teclado.nextInt();
        } while (m <= 0);

        do {
            System.out.println("Ingrese el numero de columnas:");
            n = teclado.nextInt();
        } while (n <= 0);

        int[][] matriz = crearmatrizvacia(m, n);

        System.out.println("Matriz vacía:");
        imprimirMatriz(matriz);
    }

    public static int[][] crearmatrizvacia(int m, int n) {
        int[][] matriz = new int[m][n];
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
