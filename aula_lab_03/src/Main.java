public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();
        Gato gato4 = new Gato();
        gato1.setNome("Chopp");
        System.out.println(gato1.getNome());

        System.out.println(Gato.getNmrDeGatos());

    }
}