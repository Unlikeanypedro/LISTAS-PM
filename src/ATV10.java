import java.util.Scanner;

public class ATV10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[12][4];

        String[] meses = {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
        };

        for (int i = 0; i < 12; i++) {

            System.out.println("\nVendas do mes");

            for (int j = 0; j < 4; j++) {

                System.out.println(
                    "Digite o valor vendido na semana "
                );

                vendas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nTOTAL VENDIDO EM CADA MÊS");

        double totalAno = 0;

        for (int i = 0; i < 12; i++) {

            double totalMes = 0;

            for (int j = 0; j < 4; j++) {
                totalMes += vendas[i][j];
            }

            System.out.println(
                meses[i] + ": R$ " + totalMes
            );

            totalAno += totalMes;
        }

        System.out.println("\nTOTAL VENDIDO EM CADA SEMANA");

        for (int j = 0; j < 4; j++) {

            double totalSemana = 0;

            for (int i = 0; i < 12; i++) {
                totalSemana += vendas[i][j];
            }

            System.out.println(
                "Semana " + (j + 1) + ": R$ " + totalSemana
            );
        }

        System.out.println("\nTOTAL VENDIDO NO ANO:");
        System.out.println("R$ " + totalAno);
    }
}
