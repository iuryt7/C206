package exercicio_03;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        zumbi1.nome = "iurai";
        zumbi1.vida = 100;
        zumbi2.nome = "neymar";
        zumbi2.vida = 90;
        System.out.println(zumbi1);
        System.out.println(zumbi2);
        zumbi1 = zumbi2;
        zumbi1.vida = 88;
        System.out.println(zumbi1);
        System.out.println(zumbi2);
    }
}
