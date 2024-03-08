package exercicio_02;

public class Zumbi {
    public double vida;
    public String nome;
    public double mostraVida(){
        return vida;
    }
    public void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
