import java.util.Scanner;

public class exercicio1{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int lanche1, lanche2, lanche3;

        System.out.println("Digite o número de lanches consumido na 1º hora: ");
        lanche1 = entrada.nextInt();

        System.out.println("Digite o número de lanches consumido na 2º hora");
        lanche2 = entrada.nextInt();

        System.out.println("Digite o número de lanches consumido na 3º hora");
        lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3f;

        System.out.println("Total de lanches consumidos: " + total);
        System.out.println("Media de lanches consumidos: " + media);

        entrada.close();

    }
}