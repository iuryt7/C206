package exercicio_04;

public class Zumbi {
    public double vida;
    public String nome;
    public double mostraVida(){
        return vida;
    }
    public boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(quantia < vida) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else{
            System.out.println("Impossível transferir!");
            return false;
        }
    }
}
