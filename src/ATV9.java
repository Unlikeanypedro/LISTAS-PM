import java.util.Scanner;

public class ATV9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        int somaPares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o número da posição " + i + ":");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nRELATÓRIO");

        System.out.println("Os números pares são:");

        for (int i = 0; i < 6; i++) {

            if (numeros[i] % 2 == 0) {

                System.out.println(
                        "Número " + numeros[i] +
                        " na posição " + (i + 1)
                );

                somaPares += numeros[i];
            }
        }

        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("\nOs números ímpares são:");


        for (int i = 0; i < 6; i++) {

            if (numeros[i] % 2 != 0) {

                System.out.println(
                        "Número " + numeros[i] +
                        " na posição " + (i + 1)
                );

                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de ímpares = " + quantidadeImpares);

    }
}
