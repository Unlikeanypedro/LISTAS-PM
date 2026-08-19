import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o fatorial: ");

        int fatorial = 0;
        int sum_fatorial = 1;
        
        fatorial = sc.nextInt();

        for (int i = 1; i <= fatorial; i++) {
            sum_fatorial *= i;
        }

        System.out.println(sum_fatorial);
    }
}
