public class Main_aula {
    public static void main(String[] args){
        steve Steve = new steve(10,5, new Ferramenta());
        steve Steve1 = new steve(10,5);
        Steve.xp = 20;
        Steve.armadura = 3;

        Steve.andar();
        System.out.println(Steve.vida);
        System.out.println(Steve.fome);
        Steve.andar();

        Ferramenta espada = new Ferramenta();
        Steve.ferramentaAtual = espada;
        espada.nome = "espada";
        System.out.println(Steve);
        System.out.println(Steve.ferramentaAtual.nome);


        Carro carro1 = new Carro(0, 500, true);
        System.out.println(carro1.tipoDePneu);
        System.out.println(carro1.motor.potencia);

    }
}
