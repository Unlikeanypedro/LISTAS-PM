import java.util.Scanner;

class Habitante {

    private String sexo;
    private String olhos;
    private String cabelos;
    private int idade;

    public Habitante(String sexo, String olhos, String cabelos, int idade) {
        this.sexo = sexo;
        this.olhos = olhos;
        this.cabelos = cabelos;
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getOlhos() {
        return olhos;
    }

    public String getCabelos() {
        return cabelos;
    }

    public int getIdade() {
        return idade;
    }
}

public class ATV5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidade = 0;

        boolean primeiro = true;

        while (true) {

            System.out.println("Digite a idade ");
            int idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.println("Digite o sexo :");
            String sexo = sc.nextLine();

            System.out.println("Digite os olhos:");
            String olhos = sc.nextLine();

            System.out.println("Digite os cabelos:");
            String cabelos = sc.nextLine();

            Habitante habitante = new Habitante(
                    sexo,
                    olhos,
                    cabelos,
                    idade
            );

            if (primeiro) {
                maiorIdade = habitante.getIdade();
                menorIdade = habitante.getIdade();
                primeiro = false;
            } else {

                if (habitante.getIdade() > maiorIdade) {
                    maiorIdade = habitante.getIdade();
                }

                if (habitante.getIdade() < menorIdade) {
                    menorIdade = habitante.getIdade();
                }
            }

            if (habitante.getSexo() == "feminino"
                && habitante.getIdade() >= 18
                && habitante.getIdade() <= 35
                && habitante.getOlhos().equalsIgnoreCase("verdes")
                && habitante.getCabelos().equalsIgnoreCase("loiros")) {

                quantidade++;
            }
        }

        if (primeiro) {
            System.out.println("Nenhum habitante.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println(
                    "Quantidade de mulheres entre 18 e 35 anos, " +
                    "com olhos verdes e cabelos loiros: " + quantidade
            );
        }
    }
}
