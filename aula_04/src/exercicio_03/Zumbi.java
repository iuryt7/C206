package exercicio_03;

public class Zumbi {
    public double vida;
    public String nome;
    public double mostraVida(){
        return this.vida;
    }
    public void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
    public String toString() {
        return "Zumbi{" +
                "vida=" + vida +
                ", nome='" + nome + '\'' +
                '}';
    }
}
