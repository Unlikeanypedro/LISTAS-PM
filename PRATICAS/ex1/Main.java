import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura : ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso : ");
        double peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(
            nome,
            sobrenome,
            idade,
            altura,
            peso
        );

        pessoa.CalculaIMC();

        System.out.println("-Resultado ");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("IMC: %.2f%n", pessoa.getImc());
        System.out.println("Classificação: " + pessoa.InformaObesidade());

    }
}