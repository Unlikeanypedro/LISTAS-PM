import java.util.Scanner;

public class ATV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos para ser validados");
        int n = sc.nextInt();

        int[] pm = new int[n];
        int[] calculo = new int[n];
        int[] resultado = new int[n];

        for(int j = 0; j < n; j++){
            System.out.println("Digite as matriculas");
            pm[j] = sc.nextInt();
            calculo[j] = sc.nextInt();
        }

        System.out.println("Matriculas concluidas");
        System.out.println("Iniciando validação de matriculas");

        for(int i = 0; i < n; i++){
            if (pm[i] == calculo[i]) {
                resultado[i] = pm[i];
                System.out.println(pm[i] + " Matriculado em ambas");
            }
        }
        System.out.println("Validação concluida");
    }
}
