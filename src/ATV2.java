import java.util.Scanner;

public class ATV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os valores: ");

        int[] valores = new int[3];
        int maior = 0;
        int menor = 100000;
        boolean inner_intervalo = false;
        boolean divisivel = false;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();

            if (maior < valores[i]) {
                maior = valores[i];
            }

            if (menor > valores[i]) {
                menor = valores[i];
            }
        }

        System.out.println(maior + " " + menor);
        System.out.println("Digite o valor procurado: ");

        int x = sc.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if((x % valores[i]) == 0 && !divisivel){
                System.out.println(x + " É divisivel por " + valores[i]);
                inner_intervalo = true;
            }
        }

        if (!divisivel) {
            System.out.println("Não é divisivel por nenhum número");
        }

        if(((menor < x) || (maior > x)) && !inner_intervalo){
                System.out.println(x + " Está dentro do intervalo");
                divisivel = true;
        } else {
            System.out.println(x + "Não está dentro do intervalo");
        }
    }
}