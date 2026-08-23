import java.util.Scanner;

public class ATV8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] precos = new double[10];
        int[] qtds = new int[10];

        double totalVendas = 0;
        int maiorQtd = 0;
        int posMaisVendido = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor unitario ");
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a quantidade vendida ");
        }

        System.out.println("RELATORIO DE VENDAS");

        for (int i = 0; i < 10; i++) {

            double totalObjeto = precos[i] * qtds[i];

            System.out.println("Objeto " + i);
            System.out.println("Quantidade vendida " + qtds[i]);
            System.out.println("Valor unitario - R$ " + precos[i]);
            System.out.println("Valor total R$ " + totalObjeto + "\n");

            totalVendas += totalObjeto;

            if (qtds[i] > maiorQtd) {
                maiorQtd = qtds[i];
                posMaisVendido = i;
            }
        }

        double comissao = totalVendas * 0.05;

        System.out.println("Valor total" + totalVendas);
        System.out.println("Comissao " + comissao);

        System.out.println("Objet mais vendido" + "\n" + "posição" + posMaisVendido);
        System.out.println("Quantidade vendida " + maiorQtd);
        System.out.println("Valor unitario - R$ " + precos[posMaisVendido]);

    }
}
