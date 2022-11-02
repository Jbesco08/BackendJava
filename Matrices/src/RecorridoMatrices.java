import java.util.Scanner;

public class RecorridoMatrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas ");
        int numeroFilas = entrada.nextInt();
        System.out.println("Ingrese cantidad de columnas ");
        int numeroCol = entrada.nextInt();

        int[][] matriz = new int[numeroFilas][numeroCol];

        int x = 0;

        for (int i = 0; i < numeroFilas; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < numeroCol; j++) {
                    matriz[i][j]=x;
                    x++;
                }

            }else{
                for (int j = (numeroCol-1); j >= 0; j--) {
                    matriz[i][j]=x;
                    x++;
                }
            }
        }
        System.out.println("\nLa matriz es ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
