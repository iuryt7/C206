public class Gato {
    Rato rato;
    public String cor;
    public int idade;
    public int velocidade;
    public void caçar(Rato rato){
        if(this.velocidade > rato.velocidade){
            if(rato.escondido == true){
                System.out.println("O rato fugiu!");
            }
            else{
                System.out.println("Você pegou o rato!");
            }
        }
        else{
            System.out.println("O rato fugiu!");
        }

    }
    public String toString(){
        return "Cor do Gato: " + this.cor + "Idade do Gato: " + this.idade + "Velocidade do Gato: " + this.velocidade;
    }
    public Gato(String Cor, int idade, int velocidade){
        this.cor = Cor;
        this.idade = idade;
        this.velocidade = velocidade;
    }
}
