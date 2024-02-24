import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alunos;

        System.out.print("Quantos alunos tem na sala?: ");
        alunos = entrada.nextInt();

        switch(alunos){
            case 10 :
                System.out.println("Sua sala é a : l-16");
                break;

            case 20:
                System.out.println("Sua sala é a : l-16");
                break;
            case 30:
                System.out.println("Sua sala é a : l-22");
                break;

            default:
                System.out.println("Digite um valor correto");
        }

        entrada.close();
    }
}
