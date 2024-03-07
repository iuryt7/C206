public class Gato {
    private static int nmrDeGatos;
    private String nome;
    private int idade;
    private int velocidade;

    public Gato(){
        nmrDeGatos++;
    }
    public static int getNmrDeGatos(){
        return nmrDeGatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(velocidade < 100) {
            this.velocidade = velocidade;
        }
        else{
            System.out.println("Erro");
        }
    }
}
