import java.util.Scanner;

public class ATV4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero n e m de valores");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[m];
        int[] z = new int[n + m];

        for (int j = 0; j < n; j++) {
            System.out.println("Digite o valor de x da posição: " + j);
            x[j] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            System.out.println("Digite o valor de y da posição: " + j);
            y[j] = sc.nextInt();
        }

        int posZ = 0;

        for (int i = 0; i < n; i++) {
            z[posZ] = x[i];
            posZ++;
        }

        for (int i = 0; i < m; i++) {

                boolean existe = false;

                for (int j = 0; j < posZ; j++) {
                    if (y[i] == z[j]) {
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    z[posZ] = y[i];
                    posZ++;
                }

                System.out.println("Valores de Z:");

                for (int k = 0; k < posZ; k++) {
                    System.out.println(z[k]);
                }
            }

        }
    
}
