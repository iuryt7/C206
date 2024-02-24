import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int np1, np2;

        System.out.println("Entre com a nota da sua np1: ");
        np1 = entrada.nextInt();

        System.out.println("Entre com a nota da sua np2: ");
        np2 = entrada.nextInt();


        int total = np1 + np2;
        float media = total/2f;

        System.out.println("Media da nota: " + media);

        if(media >=  60){
            System.out.println("Você passou!");
        }
        else{
            System.out.println("Você precisa fazer a np3!");
            int np3;
            System.out.println("Entre com a nota da sua np3: ");
            np3 = entrada.nextInt();
            float mediaf = np3 + media;
            if(mediaf >= 50){
                System.out.println("Você passou!");
            }
            else{
                System.out.println("Você não passou!");
            }
        }

        entrada.close();

    }
}
