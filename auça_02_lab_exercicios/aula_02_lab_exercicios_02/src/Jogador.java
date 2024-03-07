public class Jogador {
    Arma arma;
    public int energia;
    public int vida;
    public void atacar(Jogador alvo){
        if(this.energia > arma.custoDeEnergia){
            System.out.println("A vida do alvo diminuiu em " + arma.dano);
            alvo.vida -= arma.dano;
            System.out.println("Sua energia diminuiu em " + arma.custoDeEnergia);
            this.energia -= arma.custoDeEnergia;
        }
    }
    Jogador(){
        this.vida = 10;
        this.energia = 10;
    }
    Jogador(Arma arma, int energia, int vida){
       this.arma = arma;
        this.vida = vida;
       this.energia = energia;
    }
}
