import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Aluno aluno = new Aluno();

            System.out.println("\n===== CADASTRO DE ALUNO =====");
            System.out.print("Nome: ");

            aluno.nome = scanner.nextLine();

            System.out.print("Idade: ");
            aluno.idade = scanner.nextInt();

            System.out.print("Coragem: ");
            aluno.coragem = scanner.nextInt();

            System.out.print("Inteligência: ");
            aluno.inteligencia = scanner.nextInt();

            System.out.print("Ambição: ");
            aluno.ambicao = scanner.nextInt();

            System.out.print("Lealdade: ");
            aluno.lealdade = scanner.nextInt();

            System.out.print("Estratégia: ");
            aluno.estrategia = scanner.nextInt();

            System.out.print("Criatividade: ");
            aluno.criatividade = scanner.nextInt();

            scanner.nextLine();

            aluno.calcularCasa();

            aluno.exibirInformacoes();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("\nPrograma encerrado.");
    }
}
