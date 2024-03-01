import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int numGerado, numAdvinhado;
        numGerado = rand.nextInt(10) + 1;
        do {
            System.out.println("Qual o número estou pensando? ");
            numAdvinhado = entrada.nextInt();
            if (numAdvinhado != numGerado) {
                System.out.println("Errou!");
                if (numAdvinhado < numGerado) {
                    System.out.println("O número é maior!");
                } else {
                    System.out.println("O número é menor!");
                }
            }
        } while (numGerado != numAdvinhado);

        System.out.println("Parabens você acertou!");

        entrada.close();

    }
}
