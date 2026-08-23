import java.util.Scanner;

public class ATV6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char[] gabarito = new char[8];
        int aprovados = 0;

        System.out.println("Digite o gabarito da prova");

        for (int i = 0; i < 8; i++) {
            gabarito[i] = sc.next().charAt(0);
        }
        
        
        for (int i = 0; i < 10; i++) {
            
            int nota = 0;

            System.out.println("Digite o número do aluno");
            int numero = sc.nextInt();

            char[] respostas = new char[8];
            
            System.out.println("Digite as respostas");

            for (int j = 0; j < 8; j++) {
                respostas[j] = sc.next().charAt(0);
            }


            for (int j = 0; j < 8; j++) {
                if (respostas[j] == gabarito[j]) {
                    nota++;
                }
            }

            System.out.println("Aluno " + numero);
            System.out.println("Nota " + nota);

            if (nota >= 6) {
                aprovados++;
            }
        }

        double prct = (aprovados * 100.0) / 10;

        System.out.println("Taxa de aprovação" + prct);

    }
}
