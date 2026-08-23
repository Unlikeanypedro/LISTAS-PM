import java.util.Scanner;

public class ATV7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] meses = {"janeiro",
                        "fevereiro",
                        "março",
                        "abril",
                        "maio",
                        "junho" ,
                        "agosto",
                        "setembro",
                        "outubro",
                        "novembro",
                        "dezembro"};

        double maiorTemp = 0; String maiorMes = "";
        double menorTemp = 0; String menorMes = "";
        boolean primeiro = true;

        for (int i = 0; i < meses.length; i++){
            System.out.println("Digite a temperatura do mes ");
            double temp = sc.nextDouble();

            if(primeiro) {
                maiorTemp = temp;
                menorTemp = temp;
                primeiro = false;
            } else {
                if (maiorTemp < temp) {
                    maiorTemp = temp;
                    maiorMes = meses[i];
                }

                if (menorTemp > temp) {
                    menorTemp = temp;
                    menorMes = meses[i];
                }
            }

        }
        System.out.println("Maiot temperatura registrada: " + maiorTemp + " | " + maiorMes + "\n" +
        "Menor temperatura registrada: " + menorTemp + " | "+ menorMes);
    }
}
