import java.time.LocalDate;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];
        int totalAlunos = 0;

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Buscar por casa");
            System.out.println("4 - Exibir alunos por casa");
            System.out.println("5 - Exibir maiores de idade");
            System.out.println("6 - Exibir menores de idade");
            System.out.println("7 - Buscar sobrenome");
            System.out.println("8 - Encerrar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    if (totalAlunos >= 10) {
                        System.out.println("Limite de alunos atingido.");
                        break;
                    }

                    Aluno aluno = new Aluno();

                    System.out.print("Nome: ");
                    aluno.nome = scanner.nextLine();

                    System.out.print("Ano nascimento: ");
                    int ano = scanner.nextInt();

                    System.out.print("Mês nascimento: ");
                    int mes = scanner.nextInt();

                    System.out.print("Dia nascimento: ");
                    int dia = scanner.nextInt();

                    aluno.dataNascimento =
                            LocalDate.of(ano, mes, dia);

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
                    aluno.gerarCodigoMatricula(totalAlunos + 1);

                    alunos[totalAlunos] = aluno;
                    totalAlunos++;

                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:

                    for (int i = 0; i < totalAlunos; i++) {
                        alunos[i].exibirInformacoes();
                    }

                    break;

                case 3:

                    System.out.print("Casa: ");
                    String casa = scanner.nextLine();

                    int contador = 0;

                    for (int i = 0; i < totalAlunos; i++) {

                        if (alunos[i].verificarCasa(casa)) {

                            alunos[i].exibirInformacoes();
                            contador++;
                        }
                    }

                    System.out.println("Total: " + contador);
                    break;

                case 4:

                    String[] casas = {
                            "Grifinória",
                            "Sonserina",
                            "Corvinal",
                            "Lufa-Lufa"
                    };

                    for (String c : casas) {

                        System.out.println("\n" + c);

                        for (int i = 0; i < totalAlunos; i++) {

                            if (alunos[i].verificarCasa(c)) {
                                System.out.println(alunos[i].nome);
                            }
                        }
                    }

                    break;

                case 5:

                    for (int i = 0; i < totalAlunos; i++) {

                        if (alunos[i].verificarMaioridadeMagica()) {
                            alunos[i].exibirInformacoes();
                        }
                    }

                    break;

                case 6:

                    for (int i = 0; i < totalAlunos; i++) {

                        if (!alunos[i].verificarMaioridadeMagica()) {
                            alunos[i].exibirInformacoes();
                        }
                    }

                    break;

                case 7:

                    System.out.print("Sobrenome: ");
                    String busca = scanner.nextLine();

                    for (int i = 0; i < totalAlunos; i++) {

                        if (alunos[i].verificarSobrenome(busca)) {
                            alunos[i].exibirInformacoes();
                        }
                    }

                    break;

                case 8:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);

        scanner.close();
    }
}