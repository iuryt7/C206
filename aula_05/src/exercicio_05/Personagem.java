package exercicio_05;

public class Personagem {
    Arma arma;
    String nome;
    int pontos;
    void usarArma(){
        arma.resistencia -= 2;
    }
    void tomarDano(){
        pontos -= 5;
    }

    public String toString() {
        return "Personagem{" +
                "arma=" + arma +
                ", nome='" + nome + '\'' +
                ", pontos=" + pontos +
                '}';
    }
}
